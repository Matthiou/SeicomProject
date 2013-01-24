package Model;

public class ContreTorpilleurs extends Bateau {
	
	// Constructeur placement auto //
	public ContreTorpilleurs(){
		super();
		SetNom("contre-Torpilleurs");
		taille=3;
		SetOrientation(false);
		x=5;
		y=5;
	}

	public ContreTorpilleurs(int a, int b, boolean bool){
		super();
		SetNom("contre-Torpilleurs");
		taille=3;
		SetOrientation(bool);
		x=a;
		y=b;
	}

	
}
