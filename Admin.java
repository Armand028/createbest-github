public class Admin extends User{

	//Constructeur
	//On a en paramettre les paramètres nécessaires à la création de l'objet 
	//Ce constructeur n'est pas vraiment nécessaire car l'admin se trouvera déjà dans la base de données
	public Admin(String prenom,String nom, String courriel, String motDePasse){
		String typeUser= "Admin";
		String adresse;
		//On appelle le constructeur de la classe parent User 
		super(prenom, nom, courriel, motDePasse, adresse, typeUser);
	}
	
}