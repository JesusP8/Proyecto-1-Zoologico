package basededatos;

import java.sql.*;

public class ConexionBD {
    private String dbName = "Register";
    private String urlDB = "jdbc:postgresql://localhost:5432/" + this.dbName;
    private String userDB = "postgres";
    private String passDB = "1234";

    Connection cn;
    

    public Connection conexion(){
        try{
            Class.forName("org.postgresql.Driver");
            cn = DriverManager.getConnection(urlDB, userDB, passDB);
            System.out.print("Conexion Exitosa");
        }catch(Exception e){
            System.out.print(e.getMessage());
        }return cn; 
    }

    Statement createStatement(){
        throw new UnsupportedOperationException("No soportado");


    }
    
}