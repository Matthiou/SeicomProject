public class Module {
	/**
	 * Intitulé complet de l'enseignement
	 */
	private String titre;
	
	/**
	 * Titre court de l'enseignement
	 */
	private String sigle;
	
	/**
	 * tableau des étudiants assistant au cours.
	 */
	private Etudiant listeEtu[];
	
	/**
	 * taille courante du groupe suivant le module
	 */
	private int taille=0;
	
	/**
	 * nombre max d'étudiant pour le module
	 */
	private int taille_max; 
	
	/**
	 * Seul constructeur possible pour un module
	 * @param tit Intitulé complet
	 * @param sig sigle court
	 */
	public Module(String tit, String sig, int tmax){
		// ....  a completer
		listeEtu = new Etudiant[tmax];// créer le tableau ( VIDE ) d'étudiants de taille_max case 
		titre = tit;
		sigle = sig;
	}
	
	public boolean ajoute(Etudiant e){
		
		if (					// ici condition si le champ est vide renvoi vrai
		listeEtu[taille] = e;
		taille++;
		
		return true;
		} else return false;
	
	}
	
	public int getNbEtudiant(){
		return taille;
	}	
	
	public String getSigle(){
		return sigle;
	}
	
	public String getTitre(){
		return titre;
	}
	
	public String toString(){
		for (int i; i<taille; i++){		// A voir pour boucle for
		String res = this.titre() + this.sigle();
		}
	}
	
	public static void main(String [] args){
		Module m14 = new Module("C", "M14",20);
		
		Etudiant john = new Etudiant("Doe","John");
		Etudiant bob = new Etudiant("Marley","Bob");
		
		m14.ajoute(john);
		m14.ajoute(bob);
		m14.ajoute(new Etudiant("Cardigane","Jane"));
		m14.ajoute(new Etudiant("Dylan", "Bob"));
		m14.ajoute(new Etudiant("Dylan", "Thomas"));

		System.out.println(m14);
		
		
		/*
		creer un autre module POO / M21 avec 20 étudiants au max
		ajouter john et bob au module
		afficher
		bob a une absence de plus !
		ré afficher les module M14 et M21
		*/
		
	}
	
}
