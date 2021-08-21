package modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.vo.Requerimiento_1Vo;
import util.JDBCUtilities;

public class Requerimiento_1Dao {
    public ArrayList<Requerimiento_1Vo> requerimiento1() throws SQLException {
        // Su código
        ArrayList<Requerimiento_1Vo> respuesta = new ArrayList<Requerimiento_1Vo>();
        Connection conexion = JDBCUtilities.getConnection();

        try {
            String consulta = "SELECT Ciudad_Residencia, AVG(Salario) AS 'Promedio' FROM Lider l GROUP BY Ciudad_Residencia HAVING AVG(Salario) < 600000 ORDER BY AVG(Salario) DESC;";
            
            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery(consulta);

            while(resultSet.next()) {
                Requerimiento_1Vo requerimiento1 = new Requerimiento_1Vo();
                requerimiento1.setCiudad_recidencia(resultSet.getString("Ciudad_Residencia"));
                requerimiento1.setAvgSalario((int)Math.round(resultSet.getDouble("Promedio")));
                respuesta.add(requerimiento1);
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