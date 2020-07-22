package cliente_servidor;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.*;

public class Cliente2 extends JFrame implements Observer,ActionListener {
	private JFrame view;
	private JTextArea textArea;
	 private JTextField textField;
	 private JButton buttonPanel1;
	 private JLabel labeltitulo1;
	 
	 public Cliente2() {
	    	
	        componentes();
	        Servidor s = new Servidor(5000);
	        s.addObserver(this);
	        Thread t = new Thread(s);
	        t.start();
	    }

	private void componentes() {
		textArea = new JTextArea();
        textArea.setBounds(20, 30,390,320);
        buttonPanel1 = new JButton("Enviar");
        buttonPanel1.setBounds(300, 370, 90, 20);
        buttonPanel1.addActionListener(this);
        textField = new JTextField();
        textField.setBounds(20, 370, 260, 20);
        view = new JFrame();
        view.setDefaultCloseOperation(EXIT_ON_CLOSE);
        view.setTitle("Cliente 2(chat)");
        view.setLayout(null);
        view.setVisible(true);
        view.setBounds(925, 10, 450, 450);
        labeltitulo1 = new JLabel("Chat de Multiples zoo");
        labeltitulo1.setBounds(20, 10, 120, 20);
        
        view.add(textArea);
		view.add(buttonPanel1);
		view.add(textField);
		view.add(labeltitulo1);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String mensaje = "Caracas: " + this.textField.getText() +"\n";
		this.textArea.append(mensaje);
		Cliente c = new Cliente(6000, mensaje);
		Thread t = new Thread(c);
		t.start();
		textField.setText("");
		
	}

	@Override
	public void update(Observable o, Object arg) {
	
		this.textArea.append((String) arg);
	}
}