package UTN.datos;

import UTN.dominio.Estudiante;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import static UTN.conexion.Conexion.getConnection;

public class EstudianteDAO {
    // METODO LISTAR
    public List<Estudiante> listarEstudiantes() {
        List<Estudiante> estudiantes = new ArrayList<>();
        // creamos algunos objetos que son necesaarios para comunicarnos con la base de datos
        PreparedStatement ps; //Envia la sentencia a la base de datos
        ResultSet rs; //obtiene el resultado de la base de datos


        // creamos un objeto de tipo conexion
        Connection con = getConnection();
        String sql = "SELECT * FROM estudiantes2022 ORDER BY idestudiantes2022";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                var estudiante = new Estudiante();
                estudiante.setIdEstudiante(rs.getInt("idestudiantes2022"));
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                // falta agregarlo a la lista
                estudiantes.add(estudiante);
            }
        } catch (Exception e) {
            System.out.println("Oucrrio un error al seleccionar datos: " + e.getMessage());

        } finally {

            try {
                con.close();
            } catch (Exception e) {
                System.out.println("ocurrio un error al cerrar la conexion:" + e.getMessage());

            }
        }// fin finally
        return estudiantes;


    }// fin metodo Listar
}
