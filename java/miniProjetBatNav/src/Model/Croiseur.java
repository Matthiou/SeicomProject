package Model;

public class Croiseur extends Bateau {
	
	// Constructeur placement auto //
	public Croiseur(){
		super();
		SetNom("Croiseur");
		taille=4;
		SetOrientation(true);
		x=3;
		y=3;
	}

	public Croiseur(int a, int b, boolean bool){
		super();
		SetNom("Croiseur");
		taille=4;
		SetOrientation(bool);
		x=a;
		y=b;
	}

	
}
