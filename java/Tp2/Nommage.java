
public class Nommage {
	
	private String nom;		// variables
	
	public Nommage(String nom){		//Constructeur
		this.nom = nom;
	}
	
	public String getNom(){			// M�thode pour r�cup�rer le nom du fil.
		return nom;
	}

	public String toString(){
		//return "Fil("+valeurToString(valeur)+")";
		
		return getNom();//+ "(a=1,b=0) [y=0])" ;
	}	
}


