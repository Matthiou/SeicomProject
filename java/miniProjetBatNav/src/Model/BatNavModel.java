package Model;

import java.util.Observable;

public class BatNavModel extends Observable {
	private char brouillarDeGuerre[][];
	private char visibiliteJoueur[][];

	private String texte;
	
	private int x = 0, y = 0;
	private char id;
	private Bateau pAvion;
	private Bateau cTorpilleur;
	private Bateau torpilleur;
	private Bateau croiseur;
	private Bateau sMarin;
	

	// Constructeur //
	public BatNavModel() {
		brouillarDeGuerre = new char[11][11];
		visibiliteJoueur = new char[11][11];
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 11; j++) {
				brouillarDeGuerre[i][j] = 'n';
				visibiliteJoueur[i][j] = 'b';
			}
		}
		
		// Création et placement des bateaux 
		pAvion = new PorteAvion();
		Placer(pAvion);
		cTorpilleur = new ContreTorpilleurs();
		Placer(cTorpilleur);
		torpilleur = new Torpilleurs();
		Placer(torpilleur);
		croiseur = new Croiseur();
		Placer(croiseur);
		sMarin = new SousMarin();
		Placer(sMarin);
	}

	// TODO : A corriger, problème avec les 2 tableaux qui ne lance pas les bonnes modif terrain
	// quelque soit le terrain ou on clique c'est le même qui est modifié.
	public void Compare(String s) {
		// On découpe la chaine de caractère
		String str[] = s.split(":");

		// On transforme la chaine en nombre
		int i = Integer.parseInt(str[0]), j = Integer.parseInt(str[1]);
		
		// on récupère l'id du joueur
		id = str[2].charAt(0);

		// on met à jour le brouillard de guerre
		if(visibiliteJoueur[i][j]=='v' || visibiliteJoueur[i][j]=='r' ) {
			visibiliteJoueur[i][j]='r';
			texte = "Touché!!!";
			
		} else texte = "A l'eau!!!";
		brouillarDeGuerre[i][j] = visibiliteJoueur[i][j];
		visibiliteJoueur[i][j] = brouillarDeGuerre[i][j];
		// on informe l'observer
		setChanged();
		notifyObservers();
	}

	
	// pour modifier les chars du tableau visible
	public void SetChar(int x, int y, char car) {
		visibiliteJoueur[x][y] = car;
	}

	
	public String GetTexte(){
		return texte;
	}
	

	// Méthode pour récupérer la valeur char des cases du tableau brouillard de
	// guerre
	public char GetCharBdGuerre(int x, int y) {
		this.x = x;
		this.y = y;
		return brouillarDeGuerre[this.x][this.y];
	}

	
	public char GetCharVJoueur(int x, int y) {
		this.x = x;
		this.y = y;
		return visibiliteJoueur[this.x][this.y];
	}
	
	
	
	// placer le bateau à partir d'un point - A voir à rajouter un paramètre x et y //
	public void Placer(Bateau Bat) {		

		// si paramètre vertical ou horizontal //
		if (Bateau.GetOrientation() == true) {
			int j = Bateau.GetY();
			for (int i = Bateau.GetX(); i < Bateau.GetTaille() + Bateau.GetX(); i++) {
				visibiliteJoueur[i][j]='v';
			}
		} else if (Bateau.GetOrientation() == false) {
			int i = Bateau.GetX();
			for (int j = Bateau.GetY(); j < Bateau.GetTaille() + Bateau.GetY(); j++) {
				visibiliteJoueur[i][j]='v';
			}
		}		
	}

}
