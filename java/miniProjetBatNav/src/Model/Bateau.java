package Model;

// TODO vérifier implémentation de classe abstraite //

abstract public class Bateau {

	protected static int taille = 0;
	protected String nom = "bateau";
	protected static boolean orientation = true; // true = horizontal et false =
													// vertical
	protected static int x = 0, y = 0;

	/* constructeur - pas besoin car méthode abstraite ? */
	public Bateau() {
	}

	public void SetOrientation(boolean b) {
		orientation = b;
	}

	public static boolean GetOrientation() {
		return orientation;
	}

	public static int GetTaille() {
		return taille;
	}

	public void SetNom(String name) {
		nom = name;
	}

	public String GetNom() {
		return nom;
	}

	public static int GetX() {
		return x;
	}

	public static int GetY() {
		return y;
	}

}
