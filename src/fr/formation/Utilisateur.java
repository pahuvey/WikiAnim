package fr.formation;

public class Utilisateur {
	
	//Properties
	private int id;
	private String nom;
	private String prenom;
	private String pseudo;
	private TypeUtilisateur type;
	private String email;
	private String password;
	
	//constructeurs
	public Utilisateur(){
		super();
	}
	
	public Utilisateur(String nom, String prenom, String pseudo, String email, String password){
		super();
		this.nom=nom;
		this.prenom=prenom;
		this.pseudo=pseudo;
		this.email=email;
		this.password=password;
		
		
	}

@Override
	public String toString() {
		
		return pseudo + "("+ prenom +","+ nom +")";
	}


	//Getters and Setters
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public TypeUtilisateur getType() {
		return type;
	}

	public void setType(TypeUtilisateur type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
