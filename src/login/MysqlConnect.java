
package login;

/**
 *
 * @author Tauqeer
 */
import java.sql.*;
import javax.swing.*;
public class MysqlConnect {
    Connection conn = null;
    
    public static Connection ConnectDB(){
    
    try{
    Class.forName("com.mysql.jdbc.Driver"); //loading the driver
    Connection conn = DriverManager.getConnection("jdbc:mysql://den1.mysql4.gear.host/svhf","svhf","tauqeer@112");
    
//    JOptionPane.showMessageDialog(null,"Connected Successfully");
    return conn;
    }catch(Exception e){
    JOptionPane.showMessageDialog(null,e);
    return null;
    }
    }
}
