package cliente_servidor;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Observable;

public class Servidor extends Observable implements Runnable {
	
	private int puerto;
	
	public Servidor(int puerto) {
		this.puerto = puerto;
	}
	
	@Override
	public void run() {
		ServerSocket servidor = null;
		Socket sc = null;
		DataInputStream in;
		
		try {
			servidor = new ServerSocket(puerto);
			System.out.print("\nServidor iniciado\n");
			
			while(true){
				
				sc = servidor.accept();
				System.out.print("Cliente conectado\n");
				in = new DataInputStream(sc.getInputStream());
				String mensaje = in.readUTF();
				System.out.print(mensaje);
				this.setChanged();
				this.notifyObservers(mensaje);
				this.clearChanged();
				sc.close();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
		
}
