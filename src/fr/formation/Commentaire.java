package fr.formation;

import java.util.ArrayList;
import java.util.Date;

public class Commentaire extends Contenu {

	public Commentaire(Date date, String text, Utilisateur auteur){
		super(date, text, auteur);
	}

	@Override
	public String toString() {
		return "\n   Date: "+ date + "\n" + "   Commentaire: " + text + "\n" + "   Auteur: " + auteur+ "\n";
	}
	
	
		
	
}
