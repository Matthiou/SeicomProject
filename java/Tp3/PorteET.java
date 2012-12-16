
public class PorteET extends Circuit {

	public PorteET(Fil e1, Fil e2, Fil s1){
		super(2,1);
		entrees[0] = e1;
		entrees[1] = e2;
		sorties[0] = s1;
	}
	
	@Override
	public void simuler() {
		if(entrees[0].getValeur() == Fil.ZERO || entrees[1].getValeur() == Fil.ZERO){
			sorties[0].setValeur(Fil.ZERO);
		}else if(entrees[0].getValeur() == Fil.UN && entrees[1].getValeur() == Fil.UN){
			sorties[0].setValeur(Fil.UN);
		}else{
			sorties[0].setValeur(Fil.X);
		}
	}

	@Override
	public String toString() {
		return "PorteET [sortie =" + sorties[0].toString()+ "]";
	}

	public static void main(String args[]){
		Fil f1 = new Fil();
		Fil f2 = new Fil();
		Fil f3 = new Fil();
		PorteET p = new PorteET(f1, f2, f3);
		System.out.println(p);
		f1.setValeur(Fil.UN);
		f2.setValeur(Fil.UN);
		p.simuler();
		System.out.println(p);
	}
	
}
