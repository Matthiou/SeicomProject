package View;

import java.awt.*;
import java.awt.event.WindowListener;
import java.util.EventListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JFrame;
import javax.swing.JLabel;
import Model.BatNavModel;

public class GlobalView extends JFrame implements Observer { // extends JFrame

	private static final long serialVersionUID = 1L; // A quoi ça sert??

	// private JFrame terrain;
	private JLabel label1;
	private JLabel label2;
	private BatNavView joueur1;
	private BatNavView joueur2;

	/* constructeur */
	public GlobalView() {
		joueur1 = null;
		joueur2 = null;
		
		this.getContentPane().setLayout(new BorderLayout());

		label1 = new JLabel("label1");
		label2 = new JLabel("label2");
		this.getContentPane().add(label1, BorderLayout.SOUTH);
		this.getContentPane().add(label2, BorderLayout.NORTH);
		
		this.setSize(800, 400);
		this.setTitle("touche...coule");

		joueur1 = new BatNavView('1');
		joueur2 = new BatNavView('2');
		this.getContentPane().add(joueur1, BorderLayout.EAST);
		this.getContentPane().add(joueur2, BorderLayout.WEST);
	}

	public void affiche() {
		this.setVisible(true);
	}

	void majTerrain() {
		joueur1.majTerrain();
		joueur2.majTerrain();
	}

	public void setListener(EventListener al) {
		joueur1.setListener(al);
		joueur2.setListener(al);
		this.addWindowListener((WindowListener) al);
	}

	public void setModele(BatNavModel m) {
		joueur1.setModele(m);
		joueur1.setModele(m);

	}

	/* méthode de l'interface Observer */
	public void update(Observable o, Object arg) {
		majTerrain();
	}
}
