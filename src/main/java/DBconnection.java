
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Diganth Rai
 */
public class DBconnection {
  public static Connection connectDB()
    {
        

    /**
     * @param args the command line arguments
     */
    
        // TODO code application logic here
    try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             System.out.println("loded succesfully");
             Connection con = null;
      
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/bus",
                "root", "Dhari3@rai");
//            PreparedStatement psmt=connection.prepareStatement("insert into owner values(?,?)");
//            psmt.setString(1,"5");
//            psmt.setString(2,"ravi");
//            psmt.executeUpdate();
//            System.out.println("inserted succesfully");
                return con;
            
            
        }
        catch (Exception exception) {
            System.out.println(exception);
            return null;
        }
    }
}
    
