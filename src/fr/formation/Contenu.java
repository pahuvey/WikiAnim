package fr.formation;

import java.util.Date;

public class Contenu {
	//properties
	protected Date date;
	protected Utilisateur auteur;
	protected String text;
	protected int id;
	

	//constructeur
	public Contenu(){
		date= new Date();
		String text="";
		auteur=null;
	}
	public Contenu (Date date, String text, Utilisateur auteur){
		this.date=date;
		this.text=text;
		this.auteur=auteur;
	}
	
	//getters and setters
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Utilisateur getAuteur() {
		return auteur;
	}
	public void setAuteur(Utilisateur auteur) {
		this.auteur = auteur;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
