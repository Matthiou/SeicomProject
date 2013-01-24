package Model;

public class PorteAvion extends Bateau {
	
	// Constructeur placement auto //
	public PorteAvion(){
		super();
		SetNom("porte avion");
		taille=5;
		SetOrientation(true);
		x=1;
		y=1;
	}

	public PorteAvion(int a, int b, boolean bool){
		super();
		SetNom("porte avion");
		taille=5;
		SetOrientation(bool);
		x=a;
		y=b;
	}

	
}
