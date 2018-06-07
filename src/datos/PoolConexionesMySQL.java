package datos;

import java.sql.*;
import javax.sql.*;
import org.apache.commons.dbcp2.BasicDataSource;

public class PoolConexionesMySQL {
    
    public static DataSource getDataSource(){
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUsername("root");
        ds.setPassword("");
        ds.setUrl("jdbc:mysql://localhost:3306/personas?useSSL=false");
        ds.setInitialSize(5);
        return ds;
    }
    
    public static Connection getConexion() throws SQLException{
        return getDataSource().getConnection();
    }
}
