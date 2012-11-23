
public abstract class Circuit /*extends Nommage*/ {
	protected Fil entrees[];
	protected Fil sorties[];
	
	public Circuit(int nbE, int nbS){
		//super("Circuit");
		//super(String Nom);
		
		//super(1);
		entrees  = new Fil[nbE];
		sorties = new Fil[nbS];
	}
	
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
