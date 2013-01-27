package View;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.EventListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import Model.GlobalModel;

public class BatNavView extends JPanel { // implements Observer

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; // A quoi ça sert??

	private GlobalModel model;
	private char idJoueur;
	// private JFrame terrain;
	private JButton lesBouttonsVisibles[][];
	private JButton lesBouttonsBrouillardDeGuerre[][];	
	private static final Color ROUGE = new Color(200, 0, 0);
	private static final Color VERT = new Color(0, 200, 0);
	private static final Color BLEU = new Color(0, 0, 200);
	private static final Color BLANC = new Color(255, 255, 255);
	private static final Color NOIR = new Color(0, 0, 0);

	/* constructeur */
	public BatNavView(char id) {
		idJoueur = id;
		this.setLayout(new GridLayout(2,1));
		this.setSize(400, 400);
		
		JPanel pan1 = new JPanel();
		JPanel pan2 = new JPanel();
		pan1.setLayout(new GridLayout(11, 11));
		pan2.setLayout(new GridLayout(11, 11));
		
		/* on  créé les boutons représentant la partie visible pour le joueur */
		lesBouttonsVisibles = new JButton[11][11];
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 11; j++) {
				lesBouttonsVisibles[i][j] = new JButton();
				pan1.add(lesBouttonsVisibles[i][j]);
				lesBouttonsVisibles[i][j]
						.setActionCommand(i + ":" + j + ":" + idJoueur);
			}
		}

		/* les boutons représentant le terrain de l'adversaire */ 
		lesBouttonsBrouillardDeGuerre = new JButton[11][11];
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 11; j++) {
				lesBouttonsBrouillardDeGuerre[i][j] = new JButton();
				pan2.add(lesBouttonsBrouillardDeGuerre[i][j]);
				lesBouttonsBrouillardDeGuerre[i][j]
						.setActionCommand(i + ":" + j + ":" + idJoueur);
			}
		}
		
		this.add(pan2, BorderLayout.SOUTH);
		this.add(pan1, BorderLayout.NORTH);
		
		
	}

	public void affiche() {
		this.setVisible(true);
	}

	// TODO : A corriger rajouter un param id joueur a la fonction getchar et
	// retourner la valeur désirée en fonction
	@SuppressWarnings("deprecation")
	void majTerrain() {
		if (model != null) {
			for (int i = 0; i < 11; i++) {
				for (int j = 0; j < 11; j++) {
					if (model.GetCharVJoueur(i, j) == 'n') {
						lesBouttonsVisibles[i][j].setBackground(NOIR);
						lesBouttonsVisibles[i][j].setActionCommand(i + ":" + j + ":"
								+ idJoueur);
					} else if (model.GetCharVJoueur(i, j) == 'b') {
						lesBouttonsVisibles[i][j].setBackground(BLEU);
						lesBouttonsVisibles[i][j].setActionCommand(i + ":" + j + ":"
								+ idJoueur);
					} else if (model.GetCharVJoueur(i, j) == 'v') {
						lesBouttonsVisibles[i][j].setBackground(VERT);
						lesBouttonsVisibles[i][j].setActionCommand(i + ":" + j + ":"
								+ idJoueur);
					} else if (model.GetCharVJoueur(i, j) == 'r') {
						lesBouttonsVisibles[i][j].setBackground(ROUGE);
						lesBouttonsVisibles[i][j].setActionCommand(i + ":" + j + ":"
								+ idJoueur);
					}
				}
			}

			
			
			for (int i = 0; i < 11; i++) {
				for (int j = 0; j < 11; j++) {
					if (model.GetCharBDG(i, j) == 'd') {
						lesBouttonsBrouillardDeGuerre[i][j].setBackground(BLANC);
						lesBouttonsBrouillardDeGuerre[i][j].setActionCommand(i + ":" + j + ":"
								+ idJoueur);
					} else if (model.GetCharBDG(i, j) == 'b') {
						lesBouttonsBrouillardDeGuerre[i][j].setBackground(BLEU);
						lesBouttonsBrouillardDeGuerre[i][j].setActionCommand(i + ":" + j + ":"
								+ idJoueur);
						lesBouttonsBrouillardDeGuerre[i][j].disable();
					} else if (model.GetCharBDG(i, j) == 'v') {
						lesBouttonsBrouillardDeGuerre[i][j].setBackground(VERT);
						lesBouttonsBrouillardDeGuerre[i][j].setActionCommand(i + ":" + j + ":"
								+ idJoueur);
					} else if (model.GetCharBDG(i, j) == 'r') {
						lesBouttonsBrouillardDeGuerre[i][j].setBackground(ROUGE);
						lesBouttonsBrouillardDeGuerre[i][j].setActionCommand(i + ":" + j + ":"
								+ idJoueur);
						lesBouttonsBrouillardDeGuerre[i][j].disable();
					}

				}
			}
		}

	}
	// les nom des lesBoutonsBrouillardDeGuerre et lesBouttonsVisibles sont inversé
	// TODO : retirer la possibilité de cliquer sur la carte du joueur en cour
	public void setListener(EventListener al) {
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 11; j++) {
				lesBouttonsBrouillardDeGuerre[i][j].addActionListener((ActionListener) al);
			}
		}
	}
	
	
	public void setModele(GlobalModel m) {
		model = m;
		majTerrain();
	}

}
