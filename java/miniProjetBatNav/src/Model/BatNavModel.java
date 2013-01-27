package Model;

public class BatNavModel {
	private char brouillarDeGuerreJLocal[][];
	private char visibiliteJLocal[][];

	private String texte;

	private int x = 0, y = 0;

	private Bateau pAvion;
	private Bateau cTorpilleur;
	private Bateau torpilleur;
	private Bateau croiseur;
	private Bateau sMarin;
	private int coupGagnant=0;

	// Constructeur //
	public BatNavModel() {
		brouillarDeGuerreJLocal = new char[11][11];
		visibiliteJLocal = new char[11][11];
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 11; j++) {
				brouillarDeGuerreJLocal[i][j] = 'd';
				visibiliteJLocal[i][j] = 'b';
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

	public void Compare(String s) {
		// On met à jour le brouillard de guerre
		// On découpe la chaine de caractère
		String str[] = s.split(":");

		// On transforme la chaine en nombre
		int i = Integer.parseInt(str[0]), j = Integer.parseInt(str[1]);


		if (GetCharVJoueur(i, j) == 'v' ) {
			SetCharVJoueur(i, j, 'r');
			coupGagnant++;
			SetCharBDG(i, j, GetCharVJoueur(i, j));	//
			 texte = "Touché!!! Bien joué";
		} else if (GetCharVJoueur(i, j) == 'b' || (GetCharVJoueur(i, j) == 'n')) {
			SetCharVJoueur(i, j, 'n');
			SetCharBDG(i, j, 'b');
			 texte = "A l'eau!!! Dommage";
		}

	}

	// pour modifier les chars du tableau visible
	public void SetCharVJoueur(int x, int y, char car) {
		visibiliteJLocal[x][y] = car;
	}

	//retourne le char contenu dans la case demandée
	public char GetCharVJoueur(int x, int y) {
		this.x = x;
		this.y = y;
		return visibiliteJLocal[this.x][this.y];
	}

	// méthode pour changer un caractère dans une case d'un tableau
	public void SetCharBDG(int x, int y, char car) {
		brouillarDeGuerreJLocal[x][y] = car;
	}

	// Méthode pour récupérer la valeur char des cases du tableau brouillard de
	// guerre
	public char GetCharBDG(int x, int y) {
		this.x = x;
		this.y = y;
		return brouillarDeGuerreJLocal[this.x][this.y];
	}

	// méthode pour placer bateau
	public void Placer(Bateau Bat) {
		// si paramètre vertical ou horizontal //
		if (Bateau.GetOrientation() == true) {
			int j = Bateau.GetY();
			for (int i = Bateau.GetX(); i < Bateau.GetTaille() + Bateau.GetX(); i++) {
				visibiliteJLocal[i][j] = 'v';
			}
		} else if (Bateau.GetOrientation() == false) {
			int i = Bateau.GetX();
			for (int j = Bateau.GetY(); j < Bateau.GetTaille() + Bateau.GetY(); j++) {
				visibiliteJLocal[i][j] = 'v';
			}
		}
	}

	public String GetTexte(){
		return texte;
	}
	public int getNbTouche(){
		return coupGagnant;
	}
	
}
