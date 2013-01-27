package View;

import java.awt.*;
import java.awt.event.WindowListener;
import java.util.EventListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import Model.GlobalModel;

public class GlobalView extends JFrame implements Observer { // extends JFrame

	private static final long serialVersionUID = 1L; // A quoi ça sert??

	// private JFrame terrain;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel labelCenter1;
	private JLabel labelCenter2;

	private BatNavView joueurLocal = null;
	private BatNavView joueurAdverse = null;
	private GlobalModel model;
	private JPanel panNomJoueur;
	private JPanel panCenter;
	private JTextArea texte;

	/* constructeur */
	public GlobalView() {
		joueurLocal = null;
		joueurAdverse = null;
		
		// instanciation model
		model = new GlobalModel();
		
		// création de la vue Instanciation et configuration des widgets
		this.getContentPane().setLayout(new BorderLayout());
		texte = new JTextArea("message info", 5, 5);
		panNomJoueur = new JPanel();
		panNomJoueur.setLayout(new GridLayout(1, 3));
		panCenter = new JPanel();
		panCenter.setLayout(new GridLayout(2, 1));
		label1 = new JLabel("                                 joueur 2"); // rajout d'espace pour centrer
		label2 = new JLabel("");
		label3 = new JLabel("                                 Joueur 1");
		labelCenter1 = new JLabel("              Vue Brouillard de guerre");
		labelCenter2 = new JLabel("  Future Vue pour implémentation LAN");

		
		// on place tout ce petit monde
		panCenter.add(labelCenter1);
		panCenter.add(labelCenter2);

		panNomJoueur.add(label1);
		panNomJoueur.add(label2);
		panNomJoueur.add(label3);
		
		this.getContentPane().add(panCenter, BorderLayout.CENTER);
		this.getContentPane().add(panNomJoueur, BorderLayout.NORTH);
		this.getContentPane().add(texte, BorderLayout.SOUTH);
		this.setSize(1024, 768);
		this.setTitle("touche...coule");

		// Instanciation et placement de la vue terrain
		joueurLocal = new BatNavView('1');
		joueurAdverse = new BatNavView('2');
		this.getContentPane().add(joueurLocal, BorderLayout.EAST);
		this.getContentPane().add(joueurAdverse, BorderLayout.WEST);

	}

	// méthode pour afficher la vue
	public void affiche() {
		this.setVisible(true);
	}

	// méthode pour mettre a jour la vue lorsque le modèle notifiera un changement à la vue -> méthode update de Observer
	public void majTerrain() {
		if (model.GetId() == '1') {
			label1.getText();
			joueurLocal.majTerrain();
		} else
			joueurAdverse.majTerrain();
		texte.setText(model.GetInfo());
	}

	// rajout du listener
	public void setListener(EventListener al) {
		joueurLocal.setListener(al);
		joueurAdverse.setListener(al);
		this.addWindowListener((WindowListener) al);
	}

	//déclaration du modèle
	public void setModele(GlobalModel m) {
		model = m;
		joueurLocal.setModele(model);
		joueurAdverse.setModele(model);

	}

	/* méthode de l'interface Observer */
	public void update(Observable o, Object arg) {
		majTerrain();
	}
}
