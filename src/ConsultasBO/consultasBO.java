package ConsultasBO;

import Conexion.Conexion;
import ConsoltasDAO.consultasDAO;
import java.sql.SQLException;
import java.util.Vector;

public class consultasBO {
    private Conexion laconexion = null;
    public Vector consultaUsuarios() throws SQLException{
        laconexion = new Conexion();
        try{
            laconexion.Conectar();
            consultasDAO objDato = new consultasDAO(laconexion);
            Vector resVector = objDato.consultaUsuarios();
            return resVector;
        }catch (Exception ex){
            throw ex;
        }finally {
            laconexion.cerrarConexion();
        }
    }
}
