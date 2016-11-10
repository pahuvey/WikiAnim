package fr.formation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.formation.DBFactory;

public class UtilisateurDAO {

	public static void createUtilisateur(String nom, String prenom, String pseudo, TypeUtilisateur type, String email, String password){
		Connection c=DBFactory.getConnection();
		PreparedStatement pstmt = null;
		String SQL="INSERT INTO Utilisateur (lastname, firstname, pseudo, email, password) VALUES (?,?,?,?,?)";
		try {
			pstmt=c.prepareStatement(SQL);
			pstmt.setString(1, nom);
			pstmt.setString(2, prenom);
			pstmt.setString(3, pseudo);
			pstmt.setString(4, email);
			pstmt.setString(5,  password);
			
			pstmt.execute();
			pstmt.close();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Utilisateur getByEmail(String email){
		
		
		Connection c=DBFactory.getConnection();
		
		
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		String SQL="SELECT * FROM utilisateur WHERE email=?"; 
		
		try {
			pstmt=c.prepareStatement(SQL);
			pstmt.setString(1, email);
			rs = pstmt.executeQuery();
			if(rs.next()){
				Utilisateur user=new Utilisateur();
				user.setEmail(rs.getString("email"));
				user.setNom(rs.getString("lastname"));
				user.setPrenom(rs.getString("firstname"));
				user.setPassword(rs.getString("password"));
				return user;
			}
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return null;
	}
	
}
