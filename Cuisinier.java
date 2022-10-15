public class Cuisinier extends User{

	//Constructeur
	//On a en paramettre les paramètres nécessaires à la création de l'objet 
	public Cuisinier(String prenom,String nom, String courriel, String motDePasse, String adresse){
		//On appelle le constructeur de la classe parent User 
		String typeUser= "Cuisinier";
		super(prenom, nom, courriel, motDePasse, adresse, typeUser);
	}
	
}