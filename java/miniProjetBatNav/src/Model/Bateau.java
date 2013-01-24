package Model;

// TODO vérifier implémentation de classe abstraite //

abstract public class Bateau {

	protected static int taille =0;
	protected String nom="bateau";
	protected static boolean orientation = true;    // true = horizontal et false = vertical
	protected static int x=0,y=0;
	
	/* constructeur */
	public Bateau(){
	}
	
	public void SetOrientation(boolean b){
		orientation = b;
	}
	
	public static boolean GetOrientation(){
		return orientation;
	}
	
//	public void SetTaille(int taille){
//		this.taille=taille;
//	}
	
	public static int GetTaille(){
		return taille;
	}
	
	public void SetNom(String name){
		nom = name;
	}
	
	public String GetNom(){
		return nom;
	}
	
//	public void SetX(int x){
//		this.x=x;
//	}
	
	public static int GetX(){
		return x;
	}
	
//	public void SetY(int y){
//		this.y=y;
//	}
	
	public static int GetY(){
		return y;
	}
	
	
//	public void Placer(int x, int y){
//		this.x=x;
//		this.y=y;
//		
//		if (orientation==true){
//			for 
//		}
//		
//		
//		
//	}
	
}
