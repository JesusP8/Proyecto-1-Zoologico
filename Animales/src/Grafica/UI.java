package Grafica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI extends JFrame implements ActionListener {

    private JLabel labeltitulo, labeltitulo2, labeltitulo3, labeltitulo4, labeltitulo5,labeltitulo6,labeltitulo7,labeltitulo8,labeltitulo9;
    private JButton buttonPanel1, buttonPanel2, buttonPanel3, buttonPanel4;
    private JTextArea textArea,textArea2,textArea3;
    private JPanel panel1, panel2, panel3;
    private JTextField textField, textField2, textField3, textField4;
    private JFrame view;
    String texto2="";
    String texto3="";
    
    public UI() {

        setSize(500, 500);
        setTitle("Aplicacion Zoo (Ventana principal)");
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        componentes();

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
        texto2 = "Tigre" + "\n 250" + "\n 230" + "\n mamifero" + "\n Buitre" + "\n 250" + "\n 70" + "\n aves" + "\n Leon" + "\n 120" + "\n 180" + "\n mamifero" + "\n Serpiente" + "\n 26" + "\n 110" + "\n reptiles" + "\n Tortugas" + "\n 200" + "\n 230" + "\n reptiles" + "\n Flamenco" + "\n 140" + "\n 42" + "\n aves" + "\n Elefante" + "\n 300" + "\n 5550" + "\n mamiferos" + "\n Caballo" + "\n 142" + "\n 500" + "\n mamiferos" + "\n Cocodrilos" + "\n 70" + "\n 900" + "\n reptiles" + "\n Mono" + "\n 40" + "\n 14" + "\n mamiferos";
        textArea2.setText(texto2);
        textArea3 = new JTextArea();
        textArea3.setBounds(180, 50, 150, 650);


        labeltitulo = new JLabel("Bienvenidos");
        labeltitulo.setBounds(200, 90, 90, 20);
        buttonPanel1 = new JButton("Inicio");
        buttonPanel1.setBounds(60, 140, 90, 20);
        buttonPanel1.addActionListener(this);
        buttonPanel2 = new JButton("Ingresar Animal");
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
        panel2.setBounds(20, 75, 450, 250);
        panel2.setLayout(null);
        buttonPanel4 = new JButton("Enviar");
        buttonPanel4.setBounds(230, 160, 90, 80);
        buttonPanel4.addActionListener(this);
        panel2.setVisible(false);
        textField = new JTextField();
        textField.setBounds(100, 160, 120, 20);
        labeltitulo2 = new JLabel("Nombre");
        labeltitulo2.setBounds(40, 160, 120, 20);
        labeltitulo3 = new JLabel("Peso");
        labeltitulo3.setBounds(40, 180, 120, 20);
        textField2 = new JTextField();
        textField2.setBounds(100, 180, 120, 20);
        labeltitulo4 = new JLabel("Estatura");
        labeltitulo4.setBounds(40, 200, 120, 20);
        textField3 = new JTextField();
        textField3.setBounds(100, 200, 120, 20);
        labeltitulo5 = new JLabel("Tipo de Animal");
        labeltitulo5.setBounds(10, 220, 120, 20);
        textField4 = new JTextField();
        textField4.setBounds(100, 220, 120, 20);
        labeltitulo6 = new JLabel("Lista de Animales");
        labeltitulo6.setBounds(700, 400, 120, 20);
        labeltitulo7 = new JLabel("Nuevos animales ingresados");
        labeltitulo7.setBounds(170, 20, 200, 20);
        labeltitulo8 = new JLabel("Favor revisar ventana emergente para ver los Animales");
        labeltitulo8.setBounds(60, 180, 350, 20);
        labeltitulo9 = new JLabel("Lista de animales");
        labeltitulo9.setBounds(10, 20, 120, 20);


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
        panel2.add(textField);
        panel2.add(labeltitulo2);
        panel2.add(labeltitulo3);
        panel2.add(textField2);
        panel2.add(labeltitulo4);
        panel2.add(textField3);
        panel2.add(labeltitulo5);
        panel2.add(textField4);
        add(panel2);
        add(panel3);
        view.add(labeltitulo6);
        view.add(labeltitulo7);
        view.add(textArea2);
        view.add(textArea3);
        panel3.add(labeltitulo8);
        view.add(labeltitulo9);
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