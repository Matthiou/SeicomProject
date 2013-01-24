package Model;

public class SousMarin extends Bateau {
	
	// Constructeur placement auto //
	public SousMarin(){
		super();
		SetNom("sous Marin");
		taille=1;
		SetOrientation(false);
		x=9;
		y=9;
	}

	public SousMarin(int a, int b, boolean bool){
		super();
		SetNom("sous Marin");
		taille=1;
		SetOrientation(bool);
		x=a;
		y=b;
	}

	
}
