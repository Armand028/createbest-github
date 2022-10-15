public  abstract  class User{   
	String Prenom;
	String Nom;
	String Courriel;
	String MotDePasse;
	String Adresse;
	String TypeUser;

	//Constructeur
	public User (String prenom,String nom, String courriel, String motDePasse, String adresse,String typeUser){
		this.Prenom = prenom;
		this.Nom = nom;
		this.Courriel = courriel;
		this.MotDePasse = motDePasse;
		this.Adresse = adresse;
		this.TypeUser = typeUser;
	}

	//S'inscrire
	public void SignIn(User){

	}

	//Se connecter
	public void LogIn(User){
		
	}

	//Se déconnecter
	public void SignOut(User){
		
	}
}