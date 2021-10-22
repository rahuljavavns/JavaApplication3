
package mainpackage;

import dbpackage.DbConfig;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectQuery {
    public static void main(String[] args) throws SQLException {
        String query="select * from teams order by team asc";
        Connection connection=DbConfig.getConnection();
        PreparedStatement statement=connection.prepareStatement(query);
        ResultSet rs=statement.executeQuery();
        while(rs.next())
        {
            System.out.println(rs.getObject(1));
        }
    }
   
}
