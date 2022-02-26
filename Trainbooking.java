/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package trainbooking;

/**
 *
 * @author pranav
 */
public class Trainbooking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
//            Class.forName("com.mysql.jdbc.Driver");
            new MainFrame().setVisible(true);
            
        }
        catch(Error e)
        {
            System.err.println(e);
        }
    }
    
}
