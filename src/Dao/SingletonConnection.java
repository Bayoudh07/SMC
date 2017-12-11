/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ali
 */
public class SingletonConnection {
    
    private static Connection connection;
	
	public static Connection getConnection() {
		return connection;
	}

	
	static{
		
			try {
				Class.forName("com.mysql.jdbc.Driver");
                            try {
                                connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/smc_application","root","");
                            } catch (SQLException ex) {
                                Logger.getLogger(SingletonConnection.class.getName()).log(Level.SEVERE, null, ex);
                            }
				System.out.println("connexion etablie");
			}catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        // TODO Auto-generated catch block
        
		
	}
    
}
