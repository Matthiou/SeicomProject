
abstract public class Bateau extends Case {

	private int taille;
	private String nom;
	private int PositionX[];
	private int positionY[];
	
	
	/* constructeur */
	public Bateau(String name){
		super();
		nom = name;
		
	}
	

	public void SetTaille(int taille){
		this.taille=taille;
	}
	
	
	
	/* horizontale ou verticale*/
	public void SetOrientation(String orientation){
		if(orientation=="VERTICALE"){
			for (int i=0 ; i<taille+i; i++){
				//position =
			}
			
			 
		} else if (orientation=="HORIZONTALE"){
			
		}
	}
	
	
	
	public void GetPositionX(){
		
	}
	
	public void GetPositionY(){
		
	}
	
	
	
	

}
