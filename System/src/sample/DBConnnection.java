/*
*               THE ROLE OF THIS CLASS IS TO CONNECT OUR DATABASE AND
*               THIS PROGRAM, WHEN WE NEED DATABASE CONNECTION, WE JUST CREATE OBJECT
*               OF THIS CLASS
*
*
 */


package sample;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnnection {
    public Connection connection;
    public Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/customers", "root", "16023399");
        }catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }
}
