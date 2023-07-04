package UTN.datos;

import UTN.dominio.Estudiante;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import static UTN.conexion.Conexion.getConnection;

public class EstudianteDAO {
    // Método listar
    public List<Estudiante>listarEstudiantes(){
        List<Estudiante> estudiantes = new ArrayList<>();
        // creamos ahora algunos objetos que son necesarios para comunicarnos con la base de datos
        PreparedStatement ps; // Envia sentencia a la base de datos
        ResultSet rs; // Obtrenemos resultado de la base de datos
        // creamos un objeto de tipo conexion
        Connection con = getConnection();
        String sql = "SELECT * FROM estudiantes2022 ORDER BY idestudiantes2022";
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                var estudiante = new Estudiante();
                estudiante.setIdEstudiante(rs.getInt("idestudiantes2022"));
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                // falta agregarlo a la lista
                estudiantes.add(estudiante);
            }
        } catch (Exception e){
            System.out.println("Ocurrio un error al seleccionar datos: "+e.getMessage());
        }
        finally {
            try{
                con.close();
            }catch (Exception e){
               System.out.println("Ocurrio un error al cerrar la conexion: "+e.getMessage());
            }
        } // fin finally
        return estudiantes;
    }// fin metodo listar 
    
    //Método por id -> fin by id
    public boolean buscarEstudiantePorId(Estudiante estudiante){
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();
        String sql = "SELECT * FROM estudiantes2022 WHERE idestudiantes2022=?;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, estudiante.getIdEstudiante());
            rs = ps.executeQuery();
            if(rs.next()){
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                return true;//Se encontro un registro
            }//fin if
        }catch (Exception e){
            System.out.println("Ocurrió un error al buscar estudiante: "+e.getMessage());
        }//Fin catch.
        finally {
            try{
                con.close();
            }catch (Exception e){
               System.out.println("Ocurrió un error al cerrar la conexion:"+e.getMessage());
            }//Fin catch
        }//Fin finally    
        return false;
        
    public static void main(String[] args){
        //Listar los estudiantes
        var estudiantesDao = new EstudianteDAO();
        System.out.println("Listado de estudiantes: ");
        List<Estudiante> estudiantes = estudianteDao.listarEstudiantes();
        estudiantes.forEach(System.out::println);//Función lambda para imprimir
    }
    finally {
        try{
            con.close();
            
        }
     }
