
import Project.ConnectionProvider;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Diganth Rai
 */


public class rough {
    
//    create table owners(ownid int NOT NULL AUTO_INCREMENT,password varchar(15),ownname varchar(40) NOT NULL,oaddress varchar(100) NOT NULL,oemail varchar(40),phoneno varchar(15),primary key(ownid));
    private void userRegister(String password, String name, String address, String email, String phno) {
        Connection dbconn = DBconnection.connectDB();
        try {
            PreparedStatement st=(PreparedStatement)dbconn.prepareStatement("insert into owners(password,ownname,oaddress,oemail,phoneno) values(?,?,?,?,?)");
            st.setString(1,password);
            st.setString(2, name);
            st.setString(3, address);
            st.setString(4, email);
            st.setString(5, phno);
          
            int res=st.executeUpdate();
            JOptionPane.showMessageDialog(this,"Owner data inserted","Success",JOptionPane.INFORMATION_MESSAGE);
            PreparedStatement sti=dbconn.prepareStatement("select ownid from owners where ownname=?");
            sti.setString(1,name);
            ResultSet rs = sti.executeQuery();
            
            
            while (rs.next ( ))
                {
                   String category = rs.getString("ownid");
//                   tfUsername.setText(category);
                   
                }
//           jRadioButton1.setVisible(true);
//            
            
       
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Ologin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    }
//
//private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
//        // TODO add your handling code here:
//        String donorid=jTextField1.getText();
//        
//        try{
//            Connection con=ConnectionProvider.getCon();
//            Statement st=con.createStatement();
//           
//           
//            ResultSet rs=st.executeQuery("select * from donor where donorid='"+donorid+"'");
//            if(rs.next())
//            {
//                jTextField2.setText(rs.getString(2));
//                jTextField3.setText(rs.getString(3));
//                jTextField4.setText(rs.getString(4));
//                jTextField5.setText(rs.getString(5));
//                jTextField6.setText(rs.getString(6));
//                jTextField7.setText(rs.getString(7));
//                jTextField8.setText(rs.getString(8));
//                jTextArea2.setText(rs.getString(9));
//                jTextField9.setText(rs.getString(10));
//                jTextField1.setEditable(false);
//            }
//            else
//                JOptionPane.showMessageDialog(null,"Donor ID does not exist");
//        }
//        catch(Exception e)
//        {
//           
//        }

