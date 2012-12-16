
public class Fil extends Nommage {
	
	  public static final int ZERO = 0;
	    public static final int UN = 1;
	    public static final int X = 2;
	    public static final int IDEM = -1;
	 
	
	private int valeur;
	
	
	public Fil(){
		super("Fill");
		valeur = X;
	}
	public Fil(String n){
		super(n);
		valeur = X;
	}
	public int getValeur(){
		return valeur;
	}
	
	public void setValeur(int v){
		if(v == ZERO || v == UN || v == X ){
			valeur = v;
		}
	}
	
	public static String valeurToString(int v){
		String s = "X";
		switch (v) {
		case ZERO:
			s = "0";
			break;
		case UN:
			s = "1";
			break;

		default:
			break;
		}
		return s;
	}
	
	public String toString(){
		//return super.getNom(); 
		return getNom()+"("+valeurToString(valeur)+")";
	}
}
