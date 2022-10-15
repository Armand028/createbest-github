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
	public void SignUp(User){
		//Récupérer les entrées de l'utilisateur dans des variables
		//Ajouter un ligne a la table User avec les contenus des variables récupérés
	}

	//Se connecter
	public void SignIn(User){
		//Recupérer email entré
		//Récupérer mot de passe entré
		//Regarder dans la table à la ligne où se trouve l'email si le MotDePasse est identique
		
	}

	//Se déconnecter
	public void SignOut(User){
		
	}
}
