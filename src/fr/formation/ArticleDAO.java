package fr.formation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;


public class ArticleDAO {

	public static void createArticle(int auteur, String titre, String texte, int articleid){
		Connection c=DBFactory.getConnection();
		PreparedStatement pstmt = null;
		String SQL="INSERT INTO Article (auteur, titre, texte, articleid) VALUES (?,?,?,?)";
		try {
			pstmt=c.prepareStatement(SQL);
			pstmt.setInt(1, auteur);
			pstmt.setString(2, titre);
			pstmt.setString(3, texte);
			pstmt.setInt(4, articleid);
			pstmt.execute();
			pstmt.close();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		
		public static void deleteArticle(int articleid){
			Connection c=DBFactory.getConnection();
			PreparedStatement pstmt = null;
			String SQL="DELETE FROM Article (articleid) VALUES (?)";
			try {
				pstmt=c.prepareStatement(SQL);
				pstmt.setInt(1, articleid);
				pstmt.execute();
				pstmt.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		
	}
		
		public static Article readArticle(int articleid){
			Connection c=DBFactory.getConnection();
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			Article a = new Article();
			Utilisateur u = new Utilisateur();
			String SQL="SELECT * FROM Article WHERE articleid=?";
			try {
				pstmt=c.prepareStatement(SQL);
				pstmt.setInt(1, articleid);
				rs=pstmt.executeQuery();
				while(rs.next()){
					a.setId(rs.getInt("articleid"));
					u.setId(rs.getInt("auteur"));
					a.setAuteur(u);
					a.setDate(rs.getDate("date"));
					a.setText(rs.getString("texte"));
					a.setNbLike(rs.getInt("nb_like"));
					a.setTitre(rs.getString("titre"));
				}
				
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return a;
			
		}
		public static void updateArticle(String auteur, String titre, String texte, int id) {
	        Connection conn = DBFactory.getConnection();
	        PreparedStatement pstmt = null;
	        String SQL = "UPDATE article SET auteur = ?, titre = ?, texte = ? WHERE articleid = ?";
	        try {
	            pstmt = conn.prepareStatement(SQL);
	            pstmt.setString(1, auteur);
	            pstmt.setString(2, titre);
	            pstmt.setString(3, texte);
	            pstmt.setInt(4, id);
	            pstmt.execute();
	            pstmt.close(); // Close le statement connection
	        }
	        catch (SQLException se) { // Detecte QUE les exceptions de type SQL
	                                    // Exception
	            se.printStackTrace();
	        }
	    }
}
