package fr.formation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBFactory {
	public static Connection conn;
	
	public static Connection getConnection(){
		if (conn!=null){
			return conn;
		}
		try {
			Class.forName("org.postgresql.Driver");
			
				conn= DriverManager.getConnection("jdbc:postgresql://localhost:5432/Wiki", "postgres", "30culi18dico");
				System.out.println("connected");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		 catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
		
	}
	

}
