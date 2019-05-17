package MODELO;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProcesarBD {

    private Conexion con;

    public ProcesarBD() {
        System.out.println("entro");
        this.con = new Conexion();
    }

    public void ingresarArticulo(String id, String nombre, int precioVenta) {
        String datos[] = {id, nombre, Integer.toString(precioVenta)};
        insertar(datos, "INSERT INTO articulo(id_arti, nom_art,precio_art) VALUES(?,?,?)");

    }

    public boolean insertar(String datos[], String insert) {
        boolean estado = false;

        try {
            //Connection dbC= (Connection) con.conectado();
            //PreparedStatement ps = dbC.prepareStatement(insert);	
            PreparedStatement ps = con.conectado().prepareStatement(insert);

            for (int i = 0; i <= datos.length - 1; i++) {
                ps.setString(i + 1, datos[i]);
            }
            ps.execute();
            ps.close();
            estado = true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return estado;
    }

    public void listar() {
        final String strConsulta = "SELECT *FROM articulo";
        try {
            PreparedStatement ps = con.conectado().prepareStatement(strConsulta);
            ResultSet res = ps.executeQuery();

            String codigo = "";
            String nombre = "";
            int precio = 0;
            while (res.next()) {
                codigo = res.getString("id_arti");
                nombre = res.getString("nom_art");
                precio = res.getInt("precio_art");
                System.out.println(codigo + "\t" + nombre + "\t" + precio);
            }
            res.close();

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}
