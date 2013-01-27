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
	private BatNavView joueurLocal=null;
	private BatNavView joueurAdverse=null;
	private GlobalModel model;
	private JPanel panNomJoueur;
	private JTextArea texte;
	
	/* constructeur */
	public GlobalView() {
		joueurLocal = null;
		joueurAdverse = null;
		model = new GlobalModel();
		this.getContentPane().setLayout(new BorderLayout());
		
		texte = new JTextArea("message info",5,5);

		panNomJoueur = new JPanel();
		panNomJoueur.setLayout(new GridLayout(1,2));
		label1 = new JLabel("joueur 2");
		label2 = new JLabel("Joueur 1");
		
		this.getContentPane().add(panNomJoueur, BorderLayout.NORTH);
		this.getContentPane().add(texte, BorderLayout.SOUTH);
		
		panNomJoueur.add(label1);
		panNomJoueur.add(label2);
		
		this.setSize(800, 600);
		this.setTitle("touche...coule");

		joueurLocal = new BatNavView('1');
		joueurAdverse = new BatNavView('2');
		this.getContentPane().add(joueurLocal, BorderLayout.EAST);
		this.getContentPane().add(joueurAdverse, BorderLayout.WEST);
		
		
		
	}

	
	public void affiche() {
		majTerrain();
		this.setVisible(true);
	}

	
	void majTerrain() {
		if (model.GetId()=='1'){
		//label1.getText();
		joueurLocal.majTerrain();
		} else joueurAdverse.majTerrain();
		texte.setText(model.GetInfo());
	}

	public void setListener(EventListener al) {
		joueurLocal.setListener(al);
		joueurAdverse.setListener(al);
		this.addWindowListener((WindowListener) al);
	}

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
