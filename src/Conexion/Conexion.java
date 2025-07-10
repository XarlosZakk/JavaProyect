
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

//! estableciendo conexion a la base de datos
public class Conexion {
        public Connection cnn;
        public  Conexion(){}// constructor vacion

        public boolean Conectar(){
            String ls_zona = "serverTimezone=America/Bogota";
            String ls_name = "airtransec";
            String ls_url = "jdbc:mysql://localhost:3306/" + ls_name + "?" +ls_zona;
            String ls_user = "root";
            String ls_pwr = "";//? no tiene contrasena de momento

            //airTransEC
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                cnn = DriverManager.getConnection(ls_url, ls_user, ls_pwr);
                if (cnn != null){
                    return true;
                }else{
                    return false;
                }
            }catch (ClassNotFoundException | SQLException ex){
                System.out.println("Error al conectar a la base: " + ex.getMessage());
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
            return false;
        }
        //! para cerrar la conexion de la base de datos
        public boolean cerrarConexion() throws SQLException{
            if (cnn != null){
                cnn.close();
                cnn = null;
                return true;
            }
            return false;
        }
}
