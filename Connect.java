/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trainbooking;
import java.sql.*;  


/**
 *
 * @author pranav
 */
public class Connect {
    public static void  insert_table(String fname,String lname,int ag,String mail,String phonenumber){
         int m;
        try
        {
                Class.forName("com.mysql.jdbc.Driver");  
//            String servername,portnumber,sid,username,password,url;
//            servername="beasty";
//            portnumber="1433";
//            sid="cseorc";
//            username="root";
//            password="joker2001";
//            
//            url="jdbc:oracle:thin:@"+beasty+":"+1433+":"+sid;
            String sql = "insert into Passengers(Fname,Lname,Age,Email,phone_no) values('"+ fname
                     +"','" + lname + "','" + ag + "','" + mail + "','" + phonenumber + "')";
            
            try {
                Connection con;  
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Train_Reservation_Application?autoReconnect=true&useSSL=false","root","joker2001");
//                Connection con=DriverManager.getConnection(url,username,password);
                Statement st=con.createStatement();
                m=st.executeUpdate(sql);
                System.out.println("m is "+m);
//                con.close();
//                return m;
                
            } catch (SQLException ex) {
                ex.printStackTrace();
//                Logger.getLogger(ConnectionClass.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
//        return 0;
    }
    
    
    
    
    public static ResultSet result(){
        try
        {
//            System.out.println("RAECHED  ");
              Class.forName("com.mysql.jdbc.Driver");  
//            String servername,portnumber,sid,username,password,url;
//            servername="beasty";
//            portnumber="1433";
//            sid="cseorc";
//            username="root";
//            password="joker2001";
//            
//            url="jdbc:oracle:thin:@"+beasty+":"+1433+":"+sid;
            String sql = "select Train_No,Train_Name,Start_At,End_At from Train_details where Train_No=10063"; 
            
            
                Connection con;  
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Train_Reservation_Application?autoReconnect=true&useSSL=false","root","joker2001");
//                Connection con=DriverManager.getConnection(url,username,password);
                
                Statement st=con.createStatement();
 //              System.out.println("Success");
                ResultSet rs= st.executeQuery(sql);
 //              System.out.println(rs);
               rs.next();
//               System.out.println(rs.getString("Train_No"));
               return rs;
               //strArray = new String[5];
               
               //strArray[0]= rs.getString(1);
               //strArray[1]= rs.getString(2);
               //strArray[2]= rs.getString(3);
               //strArray[3]= rs.getString(4);
//                con.close();
//                return m;
                
            
            
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
    }
}

