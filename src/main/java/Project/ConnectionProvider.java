/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;

/**
 *
 * @author Diganth Rai
 */
public class ConnectionProvider {
    public static void main(String[] args) 
    {
        

    /**
     * @param args the command line arguments
     */
    
        // TODO code application logic here
         try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             System.out.println("loded succesfully");
             Connection connection = null;
      
            connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/mysql",
                "root", "Dhari3@rai");
            PreparedStatement psmt=connection.prepareStatement("insert into owner values(?,?)");
            psmt.setString(1,"5");
            psmt.setString(2,"ravi");
            psmt.executeUpdate();
            System.out.println("inserted succesfully");
            
            
        }
        catch (Exception exception) {
            System.out.println(exception);
        }
 
            
        }
    } 
        
      