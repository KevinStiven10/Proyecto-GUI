package modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.vo.Requerimiento_2Vo;
import util.JDBCUtilities;

public class Requerimiento_2Dao {
    public ArrayList<Requerimiento_2Vo> requerimiento2() throws SQLException {
        // Su código
        ArrayList<Requerimiento_2Vo> respuesta = new ArrayList<Requerimiento_2Vo>();
        Connection conexion = JDBCUtilities.getConnection();

        try {
            String consulta = "SELECT p.ID_Proyecto, c.Proveedor FROM Proyecto p JOIN Compra c ON (p.ID_Proyecto = c.ID_Proyecto) WHERE p.Ciudad = 'Quibdo' ORDER BY p.ID_Proyecto ASC;";
            
            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery(consulta);

            while(resultSet.next()) {
                Requerimiento_2Vo requerimiento2 = new Requerimiento_2Vo();
                requerimiento2.setID_Proyecto(resultSet.getInt("ID_Proyecto"));
                requerimiento2.setProveedor(resultSet.getString("Proveedor"));
                respuesta.add(requerimiento2);
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