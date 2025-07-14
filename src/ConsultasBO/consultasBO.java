package ConsultasBO;

import Conexion.Conexion;
import ConsoltasDAO.consultasDAO;
import Entidades.Usuarios;

import java.sql.SQLException;
import java.util.Vector;

public class consultasBO {

    private Conexion laconexion = null;

    //? puente para la peticion de consulta de datos a la Database
    public Vector consultaUsuarios() throws SQLException {
        laconexion = new Conexion();
        try {
            laconexion.Conectar();
            consultasDAO objDato = new consultasDAO(laconexion);
            Vector resVector = objDato.consultaUsuarios();
            return resVector;
        } catch (Exception ex) {
            throw ex;
        } finally {
            laconexion.cerrarConexion();
        }
    }
    //? puente para insetar datos en la DataBase
    public int insertarDatos (Usuarios oUrs) throws SQLException {
        laconexion = new Conexion();
        try {
            laconexion.Conectar();
            consultasDAO onjDato = new consultasDAO(laconexion);
            int reult = onjDato.insertarUsuarios(oUrs);
            return reult;
        }catch (Exception ex){
            throw ex;
        }finally {
            laconexion.cerrarConexion();
        }
    }

    //? puerte para eliminar datos en la dataBase
    public int eliminarDatos(Usuarios oUrs) throws SQLException {
      laconexion = new Conexion();
      try {
        laconexion.Conectar();
        consultasDAO onjDato = new consultasDAO(laconexion);
        int reult = onjDato.eliminarDatos(oUrs);
        return reult;
      } catch (Exception ex) {
        throw ex;
      } finally {
        laconexion.cerrarConexion();
      }
    }
    
    //? puente para actualizar datos en la dataBase
    public int actualizarDatos(Usuarios oUrs) throws SQLException {
      laconexion = new Conexion();
      try {
        laconexion.Conectar();
        consultasDAO onjDato = new consultasDAO(laconexion);
        int reult = onjDato.actualizarDatos(oUrs);
        return reult;
      } catch (Exception ex) {
        throw ex;
      } finally {
        laconexion.cerrarConexion();
      }
    }
}
