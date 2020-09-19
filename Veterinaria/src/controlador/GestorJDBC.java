/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Mascota;

/**
 *
 * @author Usuario
 */
public class GestorJDBC {

    private String URL = "jdbc:sqlserver://DESKTOP-RHL9SCM:1433;databaseName=Veterinaria";
    private String USER = "sa";
    private String PASS = "db2019";

    private Connection con = null;

//metodo de conexion
    private void openConnection() {
        try {
            con = DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    private void closeConnection() {

        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public void addMascota(Mascota mas) {
        String sql = "insert into Mascotas (Nombre,IdCliente,IdEspecie,Nacimiento) values(?,?,?,?)";
        try {
            openConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, mas.getNombre());
            pst.setInt(2, mas.getCliente().getIdCliente());
            pst.setInt(3, mas.getIdEspecie().getIdEspecie());
            pst.setInt(4, mas.getNacimiento());
            pst.executeUpdate();

            pst.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeConnection();
        }

    }
//calculo Promedio edades.

    public float getPromEdadMascota() {
        float prom = 0;
String sql = "select AVg(  2020-Nacimiento)  as Promedio from Mascotas";
        try {
            openConnection();
            Statement st = con.createStatement();
            ResultSet rs= st.executeQuery(sql);
            if(rs.next()){
                prom=rs.getFloat(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return prom;
    }
}
