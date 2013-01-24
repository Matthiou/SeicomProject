package View;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.util.EventListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Model.BatNavModel;

public class BatNavView extends JFrame implements Observer {   //extends JFrame 

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; //A quoi ça sert??

	private BatNavModel model;
	
	//private JFrame terrain;
	private JButton lesBouttons[][];
	private JLabel label1;
	private JLabel label2;
	private JPanel pan;
	private static final Color ROUGE = new Color(200, 0, 0);
	private static final Color VERT = new Color(0, 200, 0);
	private static final Color BLEU = new Color(0, 0, 200);
	private static final Color NOIR = new Color(255, 255, 255);

	/* constructeur */
	public BatNavView() {
		model = null;
		
		this.getContentPane().setLayout(new BorderLayout());	
		
		label1 = new JLabel("label1");
		label2 = new JLabel("label2");
		this.getContentPane().add(label1, BorderLayout.SOUTH);
		this.getContentPane().add(label2, BorderLayout.NORTH);
		
		
		model = new BatNavModel();
		this.setSize(800, 600);
		this.setTitle("touche...coule");
		
		
		pan = new JPanel();
		this.getContentPane().add(pan, BorderLayout.CENTER);
		pan.setLayout(new GridLayout(11,11));

		
		lesBouttons = new JButton[11][11];
		for( int i=0 ; i<11 ; i++ ){
			for( int j=0 ; j<11 ; j++ ){
				lesBouttons[i][j] = new JButton();
				model.SetChar(i, j, 'n');
				pan.add(lesBouttons[i][j]);
				lesBouttons[i][j].setActionCommand(i+":"+j);
			}
		}
		
	}

	
	public void affiche() {
		this.setVisible(true);
	}

	
	void majTerrain() {
		if (model != null) {
			for (int i = 0; i < 11; i++) {
				for (int j = 0; j < 11; j++) {
					if (model.GetChar(i, j) == 'n') {
						lesBouttons[i][j].setBackground(NOIR);
						lesBouttons[i][j].setActionCommand(i+":"+j);
					} else if (model.GetChar(i, j) == 'b') {
						lesBouttons[i][j].setBackground(BLEU);
						lesBouttons[i][j].setActionCommand(i+":"+j);
					} else if (model.GetChar(i, j) == 'v') {
						lesBouttons[i][j].setBackground(VERT);
						lesBouttons[i][j].setActionCommand(i+":"+j);
					} else if (model.GetChar(i, j) == 'r') {
						lesBouttons[i][j].setBackground(ROUGE);
						lesBouttons[i][j].setActionCommand(i+":"+j);
					}

				}
			}
		}
		label1.setText(model.GetTexte());
	}

	
	public void setListener(EventListener al) {
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 11; j++) {
				lesBouttons[i][j].addActionListener((ActionListener) al);
			}
		}
		this.addWindowListener((WindowListener) al);
	}


	public void setModele(BatNavModel m) {
		model = m;
		majTerrain();
	}
	
	/* méthode de l'interface Observer */
	public void update(Observable o, Object arg) {
		majTerrain();
	}
}
