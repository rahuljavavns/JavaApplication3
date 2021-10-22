package mainpackage;

import dbpackage.DbConfig;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import oracle.jdbc.OracleDriver;

public class Account {
    int accountno;
    String name;
    int amount;
       public Account(int accountno) throws SQLException
       {
        Connection connection = DbConfig.getConnection();
        PreparedStatement statement=connection.prepareStatement("Select * from bank where bankaccountno=?");
        statement.setInt(1,accountno);
        
        ResultSet rs=statement.executeQuery();
        if(rs.next()){
            this.name=rs.getObject("name")+"";
            this.accountno=Integer.parseInt(""+rs.getObject("bankaccountno"));
           // this.amount=Integer.parseInt(""rs.getObject("amount"));
        }
       }
    public Account(int account,int paisa)throws SQLException
    {
        Connection connection=DbConfig.getConnection();
        PreparedStatement statement1=connection.prepareStatement("update bank set amount=amount+?where bankaccountno=?");
        statement1.setInt(1,paisa);
        statement1.setInt(2, accountno);
        
        statement1.executeUpdate();
        PreparedStatement statement=connection.prepareStatement("Select * from bank where bankaccountno=?");
        statement.setInt(1,accountno);
        ResultSet rs=statement.executeQuery();
        if(rs.next()){
            
        }
        
    }
    
    
}
