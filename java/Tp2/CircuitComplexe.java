
public abstract class CircuitComplexe extends Circuit {

	/**Variable**/
	protected Circuit globalCircuit[];
	protected int nbCircuit;
	
	
	
	/**Constructeur**/
	public CircuitComplexe(int nbE,int nbS,int nbC ){	//,Circuit c[]
	super(nbE,nbS,"CircuitComplexe");
	globalCircuit = new Circuit[nbC];
	nbCircuit = nbC;
	}

	public CircuitComplexe(int nbE,int nbS,int nbC, String nom ){	
	super(nbE,nbS,nom);
	globalCircuit = new Circuit[nbC];
	nbCircuit = nbC;
	}


	/**Méthode de la classe**/
	public void simuler(){
		for (int i=0;i<nbCircuit;i++){		/* boucle for pour lancer la simulation de chaque circuit du circuit complexe. */
			globalCircuit[i].simuler();			
		}
		
	}
	
//	public static void main(String args[]){
//	Fil f1 = new Fil();
//	Fil f2 = new Fil();
//	Fil f3 = new Fil();
//	PorteOU pOU1 = new PorteOU(f1,f2,f3,"pOU1");
//	PorteOU pOU2 = new PorteOU(f1,f2,f3,"pOU2");
//	//int nbC = 2;
//	Circuit tab[]={pOU1,pOU2};
////	
////	for (int i=0; i<nbC;i++){
////		globalCircuit[] = {pOU1,pOU2};
////	}
//
//	CircuitComplexe cc = new CircuitComplexe(2, 1, 2 ,tab);
//	cc.simuler();
//	
//	
//	
//	
////	System.out.println(p);
////	f1.setValeur(Fil.UN);
////	f2.setValeur(Fil.UN);
//	cc.simuler();
//	System.out.println(cc);
//}
}
