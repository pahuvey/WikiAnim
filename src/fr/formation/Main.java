package fr.formation;

import java.sql.Connection;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*WIki WIki=new WIki();
//votre logique metier
//creer 3 articles dans le wiki
//2 auteurs
//1 auteur pour 2 articles
//1 auteur pour 1 article


Utilisateur user1=new Utilisateur("Huvey", "pierre", "phuvey");
user1.toString();

Utilisateur user2=new Utilisateur("West", "Kanye", "westcoast");

user2.setType(TypeUtilisateur.ADMIN);

Date date=new Date();

Article article1=new Article(date, "Ceci est le premiet article de mon wiki, j'esp�re que vous allez l'appr�cier", user1);
Article article2=new Article(date, "Voici mon deuxi�me article", user1);
Article article3=new Article(date,"Enfin voil� mon traisi�me article", user2);

article1.setTitre("Premir Titre");
article2.setTitre("Deuxi�me Titre");
article3.setTitre("troisi�me titre");
		

WIki.addArticle(article1);
WIki.addArticle(article2);
WIki.addArticle(article3);


Commentaire commentaire1=new Commentaire(date, "C'est nul", user2);
Commentaire commentaire2=new Commentaire(date, "C'est pourri", user2);
article1.addCommentaire(commentaire1);
article1.addCommentaire(commentaire2);





System.out.println(WIki);*/



Article c = new Article();
//Date date=new Date();
//WIki WIki=new WIki();

//ArticleDAO.createArticle(1, "l'Art du blabla", "bla blabla blalala", 4);
c=ArticleDAO.readArticle(4);
System.out.println(c);








	}

	
	

}
