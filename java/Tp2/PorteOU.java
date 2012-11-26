
public class PorteOU extends Circuit {
	
	//private String nomCircuit;

	public PorteOU(Fil e1, Fil e2, Fil s1, String nom) {
		super(2,1,nom);
		entrees[0] = e1;
		entrees[1] = e2;
		sorties[0] = s1;
	}

	@Override
	public void simuler() {
		if(entrees[0].getValeur() == Fil.X || entrees[1].getValeur() == Fil.X){
			sorties[0].setValeur(Fil.X);
		}else if(entrees[0].getValeur() == Fil.UN || entrees[1].getValeur() == Fil.UN){
			sorties[0].setValeur(Fil.UN);
		}else{
			sorties[0].setValeur(Fil.ZERO);
		}
	}
	@Override
	public String toString() {
		//return this.getNom() + "PorteOU [sortie =" + sorties[0].toString()+ "]";
		return "PorteOU " + getNom() + " (" + entrees[0].toString() + "," + entrees[1].toString() + ") " + "[" + sorties[0].toString()+ "]";

	}

}
