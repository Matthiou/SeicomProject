
public class BasculeRS extends CircuitComplexe{
	
	//Circuit bascRS[] = new Circuit[4];

	
	
	
	public BasculeRS(Fil r , Fil s , Fil q1 , Fil q2){
	super(2,2,4,"maBasculeRS");
	
	/* Porte NON ET = PorteET suivi d'une PorteNON */
//	globalCircuit[0]= new PorteET(entrees[0],sorties[1],entrees[2], "pET1");
//	globalCircuit[1]= new PorteET(entrees[1],sorties[0],entrees[3], "pET2");
//	globalCircuit[2]= new PorteNON(entrees[2],sorties[0], "pNON1");
//	globalCircuit[3]= new PorteNON(entrees[3],sorties[1], "pNON2");
	
//	Fil s = new Fil("S");
//	Fil r = new Fil("R");
//	Fil t1 = new Fil("t1");
//	Fil t2 = new Fil("t2");	
//	Fil q1 = new Fil("Q1");
//	Fil q2 = new Fil("Q2");
//	PorteET pET1 = new PorteET(s,q2,t1,"pET1");
//	PorteET pET2 = new PorteET(r,q1,t2,"pET2");
//	PorteNON pNON1 = new PorteNON(t1,q1,"pNON1");
//	PorteNON pNON2 = new PorteNON(t2,q2,"pNON2");
//	
//	globalCircuit[0]= pET1;
//	globalCircuit[1]= pET2;
//	globalCircuit[2]= pNON1;
//	globalCircuit[3]= pNON2;
	//Circuit tab[]={pET1,pET2,pNON1,pNON2};
	//CircuitComplexe bRs = new BasculeRS(globalCircuit);
	
	globalCircuit[0]= new PorteET(entrees[0],entrees[1],sorties[0], "pET1");
	globalCircuit[1]= new PorteET(entrees[0],entrees[1],sorties[0], "pET2");
	globalCircuit[2]= new PorteNON(entrees[0],sorties[0], "pNON1");
	globalCircuit[3]= new PorteNON(entrees[0],sorties[0], "pNON2");
	
	globalCircuit[0].entrees[0]=r;
	globalCircuit[1].entrees[1]=s;
	globalCircuit[2].sorties[0]=q1;
	globalCircuit[3].sorties[0]=q2;
	
	}
	

	/**M�thode de la classe**/
	
	public void PorteNONET(){
		
	}
	
	
	public void simuler(){
		
		globalCircuit[2].entrees[0]=globalCircuit[0].sorties[0];	// mise en cascade de ET et NON
		globalCircuit[3].entrees[0]=globalCircuit[1].sorties[0];	// mise en cascade de ET et NON
		globalCircuit[0].entrees[1]=globalCircuit[3].sorties[0];	// lien entre la sortie Q1 et l'entr�e S
		globalCircuit[1].entrees[0]=globalCircuit[2].sorties[0];	// lien entre la sortie Q2 et l'entr�e R
		
	}
	
	
	
	@Override
	public String toString() {
		//return "PorteET [sortie =" + sorties[0].toString()+ "]";
		return "Bascule RS " + getNom() + " (" + globalCircuit[0].entrees[0].toString() + "," + globalCircuit[1].entrees[1].toString() + ") " + "[" + globalCircuit[2].sorties[0].toString()+ " " + globalCircuit[3].sorties[0].toString() + "]";

	}

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fil f1 = new Fil("r");
		Fil f2 = new Fil("s");
		Fil f3 = new Fil("q1");
		Fil f4 = new Fil("q2");
		BasculeRS bascRS = new BasculeRS(f1,f2,f3,f4);
		f1.setValeur(Fil.ZERO);
		f2.setValeur(Fil.ZERO);
		bascRS.simuler();
		System.out.println(bascRS);
		

	}

}
