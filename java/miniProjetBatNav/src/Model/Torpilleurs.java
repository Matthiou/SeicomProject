package Model;

public class Torpilleurs extends Bateau {
	
	// Constructeur placement auto //
	public Torpilleurs(){
		super();
		SetNom("torpilleurs");
		taille=2;
		SetOrientation(false);
		x=7;
		y=7;
	}

	public Torpilleurs(int a, int b, boolean bool){
		super();
		SetNom("torpilleurs");
		taille=2;
		SetOrientation(bool);
		x=a;
		y=b;
	}

	
}
