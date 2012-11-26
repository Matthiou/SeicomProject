
public abstract class Circuit extends Nommage {
	protected Fil entrees[];
	protected Fil sorties[];

	/* Constructeur */
	
	public Circuit(int nbE, int nbS,String nom){ 	//Constructeur avec possibilit� de configurer le nom
		super(nom);
		entrees  = new Fil[nbE];
		sorties = new Fil[nbS];
	}
	
	public Circuit(int nbE, int nbS){			//Constucteur avec nom par d�faut 
		super("Circuit");
		entrees  = new Fil[nbE];
		sorties = new Fil[nbS];
	}
	
	
	/* M�thodes */
	public Fil getFilEntree(int e){
		return entrees[e];
	}

	public Fil getFilSortie(int s){
		return sorties[s];
	}
	public int getNbEntree(){
		return entrees.length;
	}

	public int getNbSortie(){
		return sorties.length;
	}

	public int getValSortie(int s){
		return s;
	}
	
	public abstract void simuler();
}
