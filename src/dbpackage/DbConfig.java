package dbpackage; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DbConfig {
    public static Connection getConnection() throws SQLException
    {
     String url="jdbc:oracle:thin:@localhost:1521:Xe";
    String user="system";
    String password="12345678";
    DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
    Connection connection=DriverManager.getConnection(url, user, password);
     return connection;
}
}
