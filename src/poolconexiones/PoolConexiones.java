package poolconexiones;

import java.sql.*;
import datos.PoolConexionesMySQL;

public class PoolConexiones {

    public static void main(String[] args) {
       Connection conn = null;
       PreparedStatement stmt = null;
       ResultSet rs = null;
       
       try{
           conn = PoolConexionesMySQL.getConexion();
           stmt = conn.prepareStatement("SELECT * FROM personas");
           rs = stmt.executeQuery();
           
           while(rs.next()){
               System.out.println(rs.getInt(1));
               System.out.println(rs.getString(2));
               System.out.println(rs.getString(3));
           }
           conn.close();
       } catch (SQLException e) {
           e.printStackTrace(System.out);
       }
    }
    
}
