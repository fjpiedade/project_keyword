/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Fernando João
 */
public abstract class ConeccaoDB {
    public Connection getMyConeccao() throws ClassNotFoundException, SQLException{    
            Class.forName("oracle.jdbc.OracleDriver");
            return DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "palavrachave", "palavrachave");
    }    
}
