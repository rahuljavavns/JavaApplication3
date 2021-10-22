package mainpackage;

import dbpackage.DbConfig;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Insert {

    public static void main(String[] args) throws SQLException {
        Connection connection=DbConfig.getConnection();
        /*
        Statement statement =connection.createStatement();
        statement.executeUpdate("insert into teams values('Ghazipur Lions')");
*/
        Scanner scanner=new Scanner(System.in);
        String teamname;
        System.out.println("Enter team");
        teamname=scanner.nextLine();
        PreparedStatement statement=connection.prepareStatement("insert into teams values(?)");
        statement.setString(1, teamname);
        statement.executeUpdate();
        
        
        
    }
    
}
