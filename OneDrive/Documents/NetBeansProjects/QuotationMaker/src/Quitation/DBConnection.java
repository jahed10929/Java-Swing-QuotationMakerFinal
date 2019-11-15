
package Quitation;

import com.mysql.jdbc.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection getConnection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/quotation","root","");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return con;
    }
}
