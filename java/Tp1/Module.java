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
	private int taille;
	
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
		
		titre = tit;
		sigle = sig;
		taille = 0;
		taille_max=tmax;
		listeEtu = new Etudiant[taille_max];// créer le tableau ( VIDE ) d'étudiants de taille_max case 

	}
	
	public boolean ajoute(Etudiant e){
		boolean val=true;
	
		for (int i=0;i<taille;i++){		// boucle for pour vérifier que l'Etudiant n'est pas déjà présent dans le module.
			if (listeEtu[i]==e){
			val=false;
			} 
		}
		
		if (taille<=taille_max && val==true){				// ici condition si le champ est vide renvoi vrai
		listeEtu[taille] = e;
		taille++;
		val=true;
		} else val=false;
	
	return val;
	}
	
	public int getNbEtudiant(){
		return taille+1;
	}	
	
	public String getSigle(){
		return sigle;
	}
	
	public String getTitre(){
		return titre;
	}
	
	public String toString(){

		String res = this.getTitre() + " - " + this.getSigle() + "\n";
		for (int i=0; i<taille; i++){			// Affichage de tous les étuduants du module
			res += " " + listeEtu[i] + "\n";	//.toString();
		}
		return res;
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
		
		Module m21 = new Module("POO", "M21",20);
		m21.ajoute(john);
		m21.ajoute(bob);
		m21.ajoute(bob);
		System.out.println(m21);
		bob.ajouteAbsence();
		System.out.println(m14);
		System.out.println(m21);
			
	}
	
}
