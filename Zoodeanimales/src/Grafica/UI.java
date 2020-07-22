package Grafica;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import basededatos.ConexionBD;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI extends JFrame implements ActionListener {
	
	ConexionBD con = new ConexionBD();
    Connection cn = con.conexion();
    

    private JLabel labeltitulo, labeltitulo2, labeltitulo3, labeltitulo4, labeltitulo5, labeltitulo6, labeltitulo7,
            labeltitulo8, labeltitulo9,labeltitulo10,labeltitulo11,labeltitulo12,labeltitulo13,labeltitulo14,labeltitulo15;
    private JButton buttonPanel1, buttonPanel2, buttonPanel3, buttonPanel4,buttonPanel5,buttonPanel6,buttonPanel7;
    private JTextArea textArea, textArea2, textArea3;
    private JPanel panel1, panel2, panel3;
    private JTextField textField, textField2, textField3, textField4,textField5;
    private JFrame view;
    private JTable tabla1;
    String texto2 = "";
    String texto3 = "";
    

    public UI() {
    	
        setSize(500, 760);
        setTitle("Aplicacion Zoo (Ventana principal)");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        componentes();
        mostrartabla();
       
    }
    

	void mostrartabla() {
		
    	DefaultTableModel modelo = new DefaultTableModel ();
    	modelo.addColumn("id/numero");
    	modelo.addColumn("nombre");
    	modelo.addColumn("peso");
    	modelo.addColumn("estatura");
    	modelo.addColumn("tipodeanimal");
    	tabla1.setModel(modelo);
    	
    	String  sql = "SELECT * FROM animales";
    	
    	String datos[] = new String  [5];
    	Statement st;
		try {
			st = cn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				datos[0]=rs.getString(1);
				datos[1]=rs.getString(2);
				datos[2]=rs.getString(3);
				datos[3]=rs.getString(4);
				datos[4]=rs.getString(5);
				modelo.addRow(datos);
			}
			tabla1.setModel(modelo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
  
    }


    private void componentes() {
    	
        view = new JFrame();
        view.setDefaultCloseOperation(EXIT_ON_CLOSE);
        view.setSize(400, 450);
        view.setTitle("Datos de los animales (Ventana Secundaria)");
        view.setLayout(null);
        view.setVisible(false);
        view.setBounds(920, 10, 450, 750);
        textArea2 = new JTextArea();
        textArea2.setBounds(10, 50, 150, 650);
        texto2 = "Tigre" + "\n 250" + "\n 230" + "\n mamifero" + "\n Buitre" + "\n 250" + "\n 70" + "\n aves"
                + "\n Leon" + "\n 120" + "\n 180" + "\n mamifero" + "\n Serpiente" + "\n 26" + "\n 110" + "\n reptiles"
                + "\n Tortugas" + "\n 200" + "\n 230" + "\n reptiles" + "\n Flamenco" + "\n 140" + "\n 42" + "\n aves"
                + "\n Elefante" + "\n 300" + "\n 5550" + "\n mamiferos" + "\n Caballo" + "\n 142" + "\n 500"
                + "\n mamiferos" + "\n Cocodrilos" + "\n 70" + "\n 900" + "\n reptiles" + "\n Mono" + "\n 40" + "\n 14"
                + "\n mamiferos";
        textArea2.setText(texto2);
        textArea3 = new JTextArea();
        textArea3.setBounds(180, 50, 150, 650);

        labeltitulo = new JLabel("Bienvenidos");
        labeltitulo.setBounds(200, 90, 90, 20);
        buttonPanel1 = new JButton("Inicio");
        buttonPanel1.setBounds(60, 140, 90, 20);
        buttonPanel1.addActionListener(this);
        buttonPanel2 = new JButton("Registro");
        buttonPanel2.setBounds(155, 140, 130, 20);
        buttonPanel2.addActionListener(this);
        buttonPanel3 = new JButton("Mostrar lista");
        buttonPanel3.setBounds(290, 140, 120, 20);
        buttonPanel3.addActionListener(this);
        textArea = new JTextArea();
        textArea.setBounds(40, 170, 400, 250);
        String texto = "Bienvenidos a la aplicacion del zoo" + "\nFavor seleccionar una de las opciones de arriba\n";
        textArea.setText(texto);
        panel1 = new JPanel();
        panel1.setBounds(20, 10, 400, 250);
        panel1.setLayout(null);
        panel1.setVisible(true);

        panel2 = new JPanel();
        panel2.setBounds(20, 75, 450, 900);
        panel2.setLayout(null);
        buttonPanel4 = new JButton("Guardar");
        buttonPanel4.setBounds(225, 100, 110, 20);
        buttonPanel4.addActionListener(this);
        buttonPanel5 = new JButton("Modificar");
        buttonPanel5.setBounds(340, 100, 110, 20);
        buttonPanel5.addActionListener(this);
        buttonPanel6 = new JButton("Actualizar");
        buttonPanel6.setBounds(225, 140, 110, 20);
        buttonPanel6.addActionListener(this);
        buttonPanel7 = new JButton("Borrar");
        buttonPanel7.setBounds(340, 140, 110, 20);
        buttonPanel7.addActionListener(this);
        panel2.setVisible(false);
        textField = new JTextField();
        textField.setBounds(100, 100, 120, 20);
        labeltitulo2 = new JLabel("Nombre");
        labeltitulo2.setBounds(40, 100, 120, 20);
        labeltitulo3 = new JLabel("Peso");
        labeltitulo3.setBounds(40, 120, 120, 20);
        textField2 = new JTextField();
        textField2.setBounds(100, 120, 120, 20);
        labeltitulo4 = new JLabel("Estatura");
        labeltitulo4.setBounds(40, 140, 120, 20);
        textField3 = new JTextField();
        textField3.setBounds(100, 140, 120, 20);
        labeltitulo5 = new JLabel("Tipo de animal");
        labeltitulo5.setBounds(10, 160, 120, 20);
        textField4 = new JTextField();
        textField4.setBounds(100, 160, 120, 20);
        labeltitulo6 = new JLabel("Lista de Animales");
        labeltitulo6.setBounds(700, 400, 120, 20);
        labeltitulo7 = new JLabel("Nuevos animales ingresados");
        labeltitulo7.setBounds(170, 20, 200, 20);
        labeltitulo8 = new JLabel("Favor revisar ventana emergente para ver los Animales");
        labeltitulo8.setBounds(60, 180, 350, 20);
        labeltitulo9 = new JLabel("Lista de animales");
        labeltitulo9.setBounds(10, 20, 120, 20);
        tabla1 = new JTable();
        tabla1.setBounds(5,230,450,410);
        labeltitulo10 = new JLabel("ID");
        labeltitulo10.setBounds(45, 205, 120, 20);
        labeltitulo11 = new JLabel("Nombre");
        labeltitulo11.setBounds(105, 205, 120, 20);
        labeltitulo12 = new JLabel("Peso");
        labeltitulo12.setBounds(200, 205, 120, 20);
        labeltitulo13 = new JLabel("Estatura");
        labeltitulo13.setBounds(280, 205, 120, 20);
        labeltitulo14 = new JLabel("Tipo de animal");
        labeltitulo14.setBounds(360, 205, 120, 20);
        labeltitulo15 = new JLabel("No escribir aqui -->");
        labeltitulo15.setBounds(130, 180, 120, 20);
        textField5 = new JTextField();
        textField5.setBounds(240, 180, 120, 20);
     

        panel3 = new JPanel();
        panel3.setBounds(20, 10, 450, 250);
        panel3.setLayout(null);
        panel3.setVisible(false);
        labeltitulo6 = new JLabel();
        labeltitulo6.setBounds(100, 50, 20, 60);

        add(labeltitulo);
        add(buttonPanel1);
        add(buttonPanel2);
        add(buttonPanel3);
        panel1.add(textArea);
        add(panel1);
        panel2.add(buttonPanel4);
        panel2.add(buttonPanel5);
        panel2.add(buttonPanel6);
        panel2.add(buttonPanel7);
        panel2.add(textField);
        panel2.add(labeltitulo2);
        panel2.add(labeltitulo3);
        panel2.add(textField2);
        panel2.add(labeltitulo4);
        panel2.add(labeltitulo5);
        panel2.add(textField3);
        panel2.add(labeltitulo10);
        panel2.add(labeltitulo11);
        panel2.add(labeltitulo12);
        panel2.add(labeltitulo13);
        panel2.add(labeltitulo14);
        panel2.add(labeltitulo15);
        panel2.add(textField4);
        panel2.add(textField5);
        add(panel2);
        add(panel3);
        view.add(labeltitulo6);
        view.add(labeltitulo7);
        view.add(textArea2);
        view.add(textArea3);
        panel3.add(labeltitulo8);
        view.add(labeltitulo9);
        panel2.add(tabla1);
       
        
        buttonPanel7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	int fila=tabla1.getSelectedRow();
            	String valor=tabla1.getValueAt(fila, 0).toString();
            	if(fila>=0) {
            		try {
						PreparedStatement pps= cn.prepareStatement("DELETE FROM animales WHERE id='"+valor+"'");
						pps.executeUpdate();
						mostrartabla();
						JOptionPane.showMessageDialog(null, "Dato eliminado");
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
            	}
            	
            }
        });
        
        
        
        buttonPanel6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	try {
					PreparedStatement pps = cn.prepareStatement("UPDATE animales SET nombre='"+textField.getText()+"',peso='"
							+textField2.getText()+"',estatura='"+textField3.getText()+"',tipodeanimal='"+textField4.getText()+"' WHERE id='"+textField5.getText()+"' ");
						pps.executeUpdate();
						JOptionPane.showMessageDialog(null, "Datos actualizados");
						textField.setText("");
						textField2.setText("");
						textField3.setText("");
						textField4.setText("");
						textField5.setText("");
						mostrartabla();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
            }
        });
        
        buttonPanel5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	int fila = tabla1.getSelectedRow();
            	if(fila>=0) {
            		textField5.setText(tabla1.getValueAt(fila, 0).toString());
            		textField.setText(tabla1.getValueAt(fila, 1).toString());
            		textField2.setText(tabla1.getValueAt(fila, 2).toString());
            		textField3.setText(tabla1.getValueAt(fila, 3).toString());
            		textField4.setText(tabla1.getValueAt(fila, 4).toString());
            }
            	else {
            		JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            	}
            	}
        });
            
  

        buttonPanel4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            
                    PreparedStatement pps;
					try {
						pps = cn.prepareStatement("INSERT INTO animales(nombre,peso,estatura,tipodeanimal) VALUES(?,?,?,?)");
						pps.setString(1, textField.getText());
                        pps.setString(2, textField2.getText());
                        pps.setString(3, textField3.getText());
                        pps.setString(4, textField4.getText());
                        pps.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Datos guardados");
                        mostrartabla();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
          
                }
            
                });
        
   
        }
    
    
        @Override
        public void actionPerformed(ActionEvent e) {
            
            if (e.getSource() == buttonPanel1) {
                panel1.setVisible(true);
                panel2.setVisible(false);
                panel3.setVisible(false);
                view.setVisible(false);
            }
                if (e.getSource() == buttonPanel2) {
                panel1.setVisible(false);
                panel2.setVisible(true);
                panel3.setVisible(false);
                view.setVisible(false);
            }
                if (e.getSource()==buttonPanel3) {
                panel1.setVisible(false);
                panel2.setVisible(false);
                panel3.setVisible(true);
                view.setVisible(true);
    
            }
    
                if(e.getSource() == buttonPanel4) {
                texto3 += textField.getText() + "\n";
                textField.setText("");
                texto3 += textField4.getText() + "\n";
                textField4.setText("");
                texto3 += textField2.getText() + "\n";
                textField2.setText("");
                texto3 += textField3.getText() + "\n";
                textField3.setText("");
                textArea3.setText(texto3);
                
    
            }
        
        }
	
	}
    

