package ConsoltasDAO;

import Conexion.Conexion;
import Entidades.Estado;
import Entidades.Usuarios;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class consultasDAO {

    //! inicializacion del codigo para realizar el crud
    private Conexion l_cnn = null;// conexion a la base de datos
    public consultasDAO(Conexion objConexion){
        l_cnn = objConexion;// recibira la conexion de la DB
    }

    //! seccion que nos obtendra los datos
    public Vector consultaUsuarios() throws SQLException{
        Vector veectorRespuesta = new Vector();
        Statement stmt = null;
        ResultSet rs = null;

        //* consulta hacia la base de datos
        String sql = "SELECT usuario_id, nombre, apellido, email, contraseña_hash, telefono, fecha_nacimiento, direccion, ciudad, pais, pasaporte_numero, fecha_registro, ultimo_acceso, estado";
        stmt = l_cnn.cnn.createStatement();
        rs = stmt.executeQuery(sql);
        Usuarios unObj = null;
        while(rs.next()){
            unObj = new Usuarios();
            unObj.setUsuario_id(rs.getInt("usuario_id"));
            unObj.setNombre(rs.getString("nombre"));
            unObj.setApellido(rs.getString("apellido"));
            unObj.setEmail(rs.getString("email"));
            unObj.setContrasena_hash(rs.getString("contrasena_hash"));
            unObj.setTelefono(rs.getString("telefono"));
            unObj.setFecha_nacimineto(rs.getDate("fecha_nacimiento") != null ? rs.getDate("fecha_nacimiento").toLocalDate(): null);
            unObj.setDireccion(rs.getString("direccion"));
            unObj.setCiudad(rs.getString("ciudad"));
            unObj.setPais(rs.getString("pais"));
            unObj.setPasaporte_numero(rs.getString("pasaporte_numero"));
            unObj.setFecha_registro(rs.getTimestamp("fecha_registro") != null ? rs.getTimestamp("fecha_registro").toLocalDateTime(): null);
            unObj.setUltimo_acceso(rs.getTimestamp("ultimo_acceso") != null ? rs.getTimestamp("ultimo_acceso").toLocalDateTime(): null);
            unObj.setEstado(rs.getString("estado") != null ? Estado.fromString(rs.getString("estado")) : null);
        }
        rs.close();
        stmt.close();
        return veectorRespuesta;
    }
}
