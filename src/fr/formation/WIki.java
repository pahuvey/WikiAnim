package fr.formation;

import java.util.ArrayList;
import java.util.List;



public class WIki {
	private List<Article> articlesList;
	
	public WIki(){
		articlesList = new ArrayList<Article>();
		
	}
	
	
	
	@Override
	public String toString() {
		String s="";
		for (Article a:articlesList){
			s=s+a.toString()+ "\n------";
			
			
			
		}
		return s;
	}



	public WIki(List<Article> articlesList){
		super();
		this.articlesList=articlesList;
	}
	
	public List<Article> getArticlesList(){
		return articlesList;
	}

	public void setArticlesList(List<Article> articlesList) {
		this.articlesList = articlesList;
	}
	public void addArticle(Article article){
		this.articlesList.add(article);
	}
	
	public void removeArticle(Article article){
		this.articlesList.remove(article);
	}
	
	
}
