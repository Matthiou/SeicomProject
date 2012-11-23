
public class Etudiant {
	/**
	 * Nom de l'�tudiant
	 */
	private String nom;
	/**
	 * Pr�nom de l'�tudiant
	 */
	private String prenom;	
	
	/**
	* Nombre d'absence de l'�tudiant
	*/
	private int nbAbs;
	
	
	/** 
	 * Constructeur par d�faut d'un �tudiant
	 * "Sans nom"
	 */
	public Etudiant(){
		nom = "Sans nom";
		prenom = "Sans prenom";
		nbAbs = 0;
	}
	
	/**
	 * Constructeur d'�tudiant
	 * @param n son nom
	 * @param p son pr�nom
	 */
	public Etudiant(String n, String p){
		nom = n;
		prenom = p;
		nbAbs = 0;
	}
	
	/**
	 * Donne les initiales de la personne
	 * @return les initiales
	 */
	public String shortName(){
		String res = this.nom.substring(0, 1) +this.prenom.substring(0, 1)  ;
		return res;
	}
	/**
	 * Donne le nom complet de la personne
	 * @return le nom et le pr�nom
	 */
	public String fullName(){
		String res = this.nom+ " " + this.prenom  ;
		return res;
	}
	
	/**
	 * Ajoute une absence au compteur d'absence de l'�tudiant
	 */
	public void ajouteAbsence(){
		nbAbs++;
	}
	
	/**
	 * Retire une absence au compteur d'absence de l'�tudiant (s'il y en a au moins une)
	 */

	public void justifierAbsence(){
		nbAbs--;
	}

	/**
	 * accesseur 
	 * @return nombre d'absences
	 */
	public int getNbAbs(){
		return nbAbs;
	}
	
	/**
	 * M�thode standard pour convertir en chaine de caract�res
	 */
	public String toString(){
		String res = "[" + this.shortName() + "] " + this.fullName();
			if (this.getNbAbs()>0) {
				res = res + "(" + this.getNbAbs()+ " abs)";
			}
		return res;
	} 
	
	/**
	 * Egalit� de 2 �tudiants : comparaison des noms
	 * @param e l'�tudiant � comparer
	 * @return vrai si les �tudiants sont les m�mes
	 */
	public boolean equals(Etudiant e){
		return e.nom.equals(this.nom);
	}
	
	public static void main(String [] args){
		Etudiant p1 = new Etudiant();
		Etudiant p2 = new Etudiant("John", "Doe");
		Etudiant p3;
	
		System.out.println(p1);	//.toString());// Q4 ici
		System.out.println(p2); // Q5 ici
		
		p3 = new Etudiant("John", "Doe"); 	// Q6 ici
		System.out.println(p3 == p2); 		// Q6 ici
		System.out.println(p3.equals(p2)); 	// Q6 ici
		
		String n = new String("Patrick");
		p1 = new Etudiant(n,"Jane");
		
		System.out.println(p1.shortName()); 
		System.out.println(p1.fullName());
		p1.ajouteAbsence();
		p1.ajouteAbsence();
		System.out.println(p1);
		
		p3 = p1;
		p3.justifierAbsence();
		System.out.println(p1);		
		System.out.println(p3);

	}

}
