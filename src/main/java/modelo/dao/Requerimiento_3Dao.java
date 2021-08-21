package modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.vo.Requerimiento_3Vo;
import util.JDBCUtilities;

public class Requerimiento_3Dao {
    public ArrayList<Requerimiento_3Vo> requerimiento3() throws SQLException {
        // Su código
        ArrayList<Requerimiento_3Vo> respuesta = new ArrayList<Requerimiento_3Vo>();
        Connection conexion = JDBCUtilities.getConnection();

        try {
            String consulta = "SELECT p.ID_Proyecto, mc.Nombre_Material FROM Proyecto p JOIN Compra c ON (p.ID_Proyecto = c.ID_Proyecto) JOIN MaterialConstruccion mc ON (mc.ID_MaterialConstruccion = c.ID_MaterialConstruccion) WHERE p.ID_Proyecto BETWEEN 5 and 15 ORDER BY p.ID_Proyecto ASC;";
            
            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery(consulta);

            while(resultSet.next()) {
                Requerimiento_3Vo requerimiento3 = new Requerimiento_3Vo();
                requerimiento3.setID_Proyecto(resultSet.getInt("ID_Proyecto"));
                requerimiento3.setNombre_Material(resultSet.getString("Nombre_Material"));
                respuesta.add(requerimiento3);
            }
            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            System.err.println("Error: "+e);

        } finally {
            if (conexion!=null) {
                conexion.close();
            }
        }
        // Retornar la coleccion vo's
        return respuesta;
    }
}