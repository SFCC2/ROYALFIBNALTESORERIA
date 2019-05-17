package MODELO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import VISTA.PruebaDB;
import java.sql.PreparedStatement;

public class Conexion {

    String bd = "tesoreria";
    private final String url = "jdbc:mysql://localhost:3306/" + bd;
    Connection con = null;

    public Conexion() {}

    public void startDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, "root", "");
            System.out.println("Conexion a base de datos inventario listo");
            //con.close();

        } catch (SQLException e) {
            System.out.println(e.toString() + " Error 1");
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString() + " error 2");
        }
    }
    public static void main(String[] args) {
        //Conexion c = new Conexion();
        PruebaDB pdb = new PruebaDB();
        pdb.createWindow();
    }

    /**
     * Return Connection DB instance
     *
     * @return con (Connection)
     */
    public Connection conectado() {
        return con;
    }

    public void insertar(int rol, String user)
    {
        try {
            final String insert = "INSERT INTO user VALUES (?, ?)";
            PreparedStatement st = this.conectado().prepareStatement(insert);
            st.setString(1, Integer.toString(rol));
            st.setString(2, user);
            st.execute();
            
        } catch (Exception e) {
            System.out.println(String.format("Insertion error, -> %s", e.getMessage()));
        }
    }
    /**
     * Close DB connection
     */
    public void desconectar() {
        try {
            con.close();
            System.out.println("conexion terminada");
        } catch (Exception e) {
            System.out.println(String.format("Connection close error: %s", e.getMessage()));
        }

    }
}
