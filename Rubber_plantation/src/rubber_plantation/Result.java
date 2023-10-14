/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rubber_plantation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ranji
 */
public class Result {
    public static ResultSet getData(String query)
    {
        Connection con=null;
        Statement st=null;
        ResultSet rs=null;
        try{
            con=(Connection) ConnectionProvider.getCon();
            st=con.createStatement();
            rs=st.executeQuery(query);
            return rs;
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
}
