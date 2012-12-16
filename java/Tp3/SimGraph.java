/* implementation de la classe SimGraph Tp3 POO Seicom 2012 */
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.AbstractButton;

//import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ItemListener;

import java.awt.GridLayout;
import java.awt.BorderLayout;
//import java.awt.ItemSelectable;
import java.awt.event.*;

//import java.util.EventListener;

public class SimGraph extends JFrame implements ItemListener, ActionListener {

	/* déclaration des variables */

	/* les boutons */
	JButton init;
	JButton quit;
	JButton topSimu;

	/* les labels */
	JLabel typePorte;
	JLabel entree1;
	JLabel entree2;
	JLabel sortie;
	JLabel caseVide;

	/* JComboBox */
	JComboBox cbox;
	String[] liste = { "PorteET", "PorteOU", "PorteNON", "PorteXOR" };

	/* les zones de texte */
	JTextField champsE1;
	JTextField champsE2;
	JTextField champsSortie;

	/* bouton radio */
	JRadioButton boutonradio1;
	JRadioButton boutonradio2;
	JRadioButton boutonradio3;
	JRadioButton boutonradio4;
	JRadioButton boutonradio5;
	JRadioButton boutonradio6;
	ButtonGroup bg2, bg1;

	/* les fils */
	Fil e1;
	Fil e2;
	Fil s1;

	/* les portes */
	PorteET pEt;
	PorteOU pOu;
	PorteXOR pXor;
	PorteNON pNon;

	/* constructeur */
	public SimGraph() {

		init = new JButton("initialiser");
		quit = new JButton("quitter");
		topSimu = new JButton("top simulation");

		typePorte = new JLabel("Type de porte");
		entree1 = new JLabel("entree 1");
		entree2 = new JLabel("entree 2");
		sortie = new JLabel("sortie");
		caseVide = new JLabel("");

		champsE1 = new JTextField("X");
		champsE2 = new JTextField("X");
		champsSortie = new JTextField("sortie");

		/* Premier groupe de bouton radio */
		bg1 = new ButtonGroup();
		boutonradio1 = new JRadioButton("0", false);
		boutonradio2 = new JRadioButton("1", false);
		boutonradio3 = new JRadioButton("X", true);
		bg1.add(boutonradio1);
		bg1.add(boutonradio2);
		bg1.add(boutonradio3);

		/* deuxieme groupe de bouton radio */
		bg2 = new ButtonGroup();
		boutonradio4 = new JRadioButton("0", false);
		boutonradio5 = new JRadioButton("1", false);
		boutonradio6 = new JRadioButton("X", true);
		bg2.add(boutonradio4);
		bg2.add(boutonradio5);
		bg2.add(boutonradio6);

		/*
		 * la liste deroulante avec la liste des portes (tableau de string
		 * "liste")
		 */
		cbox = new JComboBox(liste);

		/* si on quitte la fenetre, ferme l'appli */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		/* le titre de l'interface */
		setTitle("user Interface");

		/* taille de la fenetre */
		setSize(350, 200);

		/* Placement des boutons sur la fenetre */
		this.getContentPane().setLayout(new BorderLayout());

		/* position haute de la fenetre */
		JPanel haut = new JPanel();
		getContentPane().add(haut, BorderLayout.NORTH);
		haut.setLayout(new FlowLayout());
		haut.add(typePorte);
		haut.add(cbox);

		/* position centrale de la fenetre */
		/* les 2 groupes de boutons radio */
		JPanel radio1 = new JPanel();
		JPanel radio2 = new JPanel();
		radio1.setLayout(new FlowLayout());
		radio1.add(boutonradio1);
		radio1.add(boutonradio2);
		radio1.add(boutonradio3);

		radio2.setLayout(new FlowLayout());
		radio2.add(boutonradio4);
		radio2.add(boutonradio5);
		radio2.add(boutonradio6);

		JPanel centre = new JPanel();
		getContentPane().add(centre, BorderLayout.CENTER);
		centre.setLayout(new GridLayout(3, 3));
		centre.add(radio1); // ligne 1 de la gridlayout
		centre.add(champsE1);
		centre.add(entree1);
		centre.add(radio2); // ligne 2 de la gridlayout
		centre.add(champsE2);
		centre.add(entree2);
		centre.add(new JPanel()); // ligne 3 de la gridlayout 1 ere case vide
		centre.add(champsSortie);
		centre.add(sortie);

		/* les boutons en bas de la fenetre */
		JPanel bas = new JPanel();
		getContentPane().add(bas, BorderLayout.SOUTH);
		bas.setLayout(new FlowLayout());
		bas.add(init, FlowLayout.LEFT);
		bas.add(quit, FlowLayout.CENTER);
		bas.add(topSimu, FlowLayout.RIGHT);

		/* on rajoute le listener */
		boutonradio1.addItemListener(this);
		boutonradio2.addItemListener(this);
		boutonradio3.addItemListener(this);
		boutonradio4.addItemListener(this);
		boutonradio5.addItemListener(this);
		boutonradio6.addItemListener(this);

		init.addActionListener(this);
		quit.addActionListener(this);
		topSimu.addActionListener(this);
		cbox.addActionListener(this);
		/* fenetre visible */
		// setVisible(true);

		/* Instanciation des Fils */
		e1 = new Fil("e1");
		e2 = new Fil("e2");
		s1 = new Fil("s1");

		/* instanciation des portes */
		pEt = new PorteET(e1, e2, s1);
		pOu = new PorteOU(e1, e2, s1);
		pXor = new PorteXOR(e1, e2, s1);
		pNon = new PorteNON(e1, s1);
	}

	/* fin constructeur */

	/* méthode issue de l'interface Itemlistener */
	public void itemStateChanged(ItemEvent e) {
		AbstractButton aButton = (AbstractButton) e.getSource();
		String label = aButton.getText();
		if (aButton == boutonradio1 || aButton == boutonradio2
				|| aButton == boutonradio3) {
			champsE1.setText(label);
			/* on injecte les valeurs des jRadioButton dans les fils */
			if (aButton == boutonradio1) {
				e1.setValeur(0);
			} else if (aButton == boutonradio2) {
				e1.setValeur(1);
			} else if (aButton == boutonradio3) {
				e1.setValeur(2);
			}

		} else {
			champsE2.setText(label);
			if (aButton == boutonradio4) {
				e2.setValeur(0);
			}
			if (aButton == boutonradio5) {
				e2.setValeur(1);
			}
			if (aButton == boutonradio6) {
				e2.setValeur(2);
			}
		}
	}

	/* méthode issue de l'interface ActionListener */
	public void actionPerformed(ActionEvent a) {
		if (a.getSource() == init) {
			boutonradio3.setSelected(true);
			boutonradio6.setSelected(true);
			champsSortie.setText("sortie");
		} else if (a.getSource() == quit) {
			this.dispose();
		} else if (a.getSource() == topSimu) { // TODO: utiliser une machine a
												// etat pour la jList
			if (cbox.getSelectedIndex() == 0) { // selection PorteET dans la
												// liste
				pEt.simuler();
			} else if (cbox.getSelectedIndex() == 1) { // selection PorteOU dans
														// la liste
				pOu.simuler();
			} else if (cbox.getSelectedIndex() == 2) { // selection PorteNON
				champsE2.setText("aucun"); // dans la liste
				pNon.simuler();
			} else if (cbox.getSelectedIndex() == 3) { // selection PorteXOR
														// dans la liste
				pXor.simuler();
			}
			champsSortie.setText(s1.toString());
		}
	}

	/* main */
	public static void main(String[] args) {
		SimGraph userInt = new SimGraph();
		userInt.setVisible(true);
	}

}
