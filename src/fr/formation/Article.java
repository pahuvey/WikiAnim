package fr.formation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Article extends Contenu {
	
	private int nbLike;
	private String titre;
	private List<Commentaire> commentairesList;
	
	public Article(){
		super();
	}
	public Article(Date date, String text, Utilisateur auteur){
		super(date, text, auteur);
		this.nbLike=0;
		this.commentairesList = new ArrayList<Commentaire>();
		this.titre="";
		
	}
	
	public Article(int nbLike, String titre, List<Commentaire> commentairesList){
		super();
		this.nbLike=nbLike;
		this.titre=titre;
		this.commentairesList=commentairesList;
	}
	
	
	
	@Override
	public String toString() {
		String k="";
		/*for (Commentaire c:commentairesList){
			k=k+c.toString() + "+++++++\n";
		}*/
		return "\nDate: "+ date + "\n" + "titre: " + titre + "\n" + "Article: " + text + "\n" + "Auteur: " + auteur+ "\n" + /*"Nombre de commentaires: " + commentairesList.size() +*/ "\n" + k;
	}
	public void addCommentaire(Commentaire commentaire){
		commentairesList.add(commentaire);
		
	}
	
	public void removeCommentaire(Commentaire commentaire){
		commentairesList.remove(commentaire);
	}
	
	public int getNbLike() {
		return nbLike;
	}
	public void setNbLike(int nbLike) {
		this.nbLike = nbLike;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public List<Commentaire> getCommentaires() {
		return commentairesList;
	}
	public void setCommentaires(List<Commentaire> commentairesList) {
		this.commentairesList = commentairesList;
	}
	
	
}
