package View;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.EventListener;
//import java.util.Observable;
//import java.util.Observer;
import javax.swing.JButton;
import javax.swing.JPanel;

import Model.BatNavModel;

public class BatNavView extends JPanel  { 		//implements Observer

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; // A quoi ça sert??

	private BatNavModel model;
	private char idJoueur;
	// private JFrame terrain;
	private JButton lesBouttons[][];
	private static final Color ROUGE = new Color(200, 0, 0);
	private static final Color VERT = new Color(0, 200, 0);
	private static final Color BLEU = new Color(0, 0, 200);
	private static final Color NOIR = new Color(255, 255, 255);

	/* constructeur */
	public BatNavView(char id) {
		model = null;
		
		idJoueur = id;

		model = new BatNavModel();
		this.setSize(200, 200);
		this.setLayout(new GridLayout(11, 11));

		lesBouttons = new JButton[11][11];
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 11; j++) {
				lesBouttons[i][j] = new JButton();
				//model.SetChar(i, j, 'n');
				this.add(lesBouttons[i][j]);
				lesBouttons[i][j].setActionCommand(i + ":" + j + ":" + idJoueur);
			}
		}

	}

	public void affiche() {
		this.setVisible(true);
	}

	
	// TODO : A corriger rajouter un param id joueur a la fonction getchar et retourner la valeur désirée en fonction 
	void majTerrain() {
//		if (model != null) {
		if (idJoueur=='1'){
			for (int i = 0; i < 11; i++) {
				for (int j = 0; j < 11; j++) {
					if (model.GetCharBdGuerre(i, j) == 'n') {
						lesBouttons[i][j].setBackground(NOIR);
						lesBouttons[i][j].setActionCommand(i + ":" + j + ":" + idJoueur);
					} else if (model.GetCharBdGuerre(i, j) == 'b') {
						lesBouttons[i][j].setBackground(BLEU);
						lesBouttons[i][j].setActionCommand(i + ":" + j + ":" + idJoueur);
					} else if (model.GetCharBdGuerre(i, j) == 'v') {
						lesBouttons[i][j].setBackground(VERT);
						lesBouttons[i][j].setActionCommand(i + ":" + j + ":" + idJoueur);
					} else if (model.GetCharBdGuerre(i, j) == 'r') {
						lesBouttons[i][j].setBackground(ROUGE);
						lesBouttons[i][j].setActionCommand(i + ":" + j + ":" + idJoueur);
					}

				}
			}
		}
		
		if (idJoueur=='2'){
			for (int i = 0; i < 11; i++) {
				for (int j = 0; j < 11; j++) {
					if (model.GetCharVJoueur(i, j) == 'n') {
						lesBouttons[i][j].setBackground(NOIR);
						lesBouttons[i][j].setActionCommand(i + ":" + j + ":" + idJoueur);
					} else if (model.GetCharVJoueur(i, j) == 'b') {
						lesBouttons[i][j].setBackground(BLEU);
						lesBouttons[i][j].setActionCommand(i + ":" + j + ":" + idJoueur);
					} else if (model.GetCharVJoueur(i, j) == 'v') {
						lesBouttons[i][j].setBackground(VERT);
						lesBouttons[i][j].setActionCommand(i + ":" + j + ":" + idJoueur);
					} else if (model.GetCharVJoueur(i, j) == 'r') {
						lesBouttons[i][j].setBackground(ROUGE);
						lesBouttons[i][j].setActionCommand(i + ":" + j + ":" + idJoueur);
					}

				}
			}
		}
		
		//}
	}

	// TODO : retirer la possibilité de cliquer sur la carte du joueur en cour
	public void setListener(EventListener al) {
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 11; j++) {
				lesBouttons[i][j].addActionListener((ActionListener) al);
			}
		}
	}

	public void setModele(BatNavModel m) {
		model = m;
		majTerrain();
	}

//	/* méthode de l'interface Observer */
//	public void update(Observable o, Object arg) {
//		majTerrain();
//	}
}
