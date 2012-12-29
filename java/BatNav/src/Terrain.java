import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Terrain extends JFrame implements ActionListener {

	Case lesBouttons[][];
	JLabel label1;
	JLabel label2;

	/* constructeur */
	public Terrain() {
		super("Bataille navale");
		setSize(800, 600);

		label1 = new JLabel("Score");

		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(label1, BorderLayout.SOUTH);
		JPanel centre = new JPanel();
		getContentPane().add(centre, BorderLayout.CENTER);
		centre.setLayout(new GridLayout(11, 11));
		lesBouttons = new Case[11][11];
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 11; j++) {
				lesBouttons[i][j] = new Case();
				// lesBouttons[i].setActionCommand("Action" + i);
				lesBouttons[i][j].addActionListener(this);
				lesBouttons[i][j].SetIdCase(i, j);
				centre.add(lesBouttons[i][j]);
			}
		}
		
		label2 = new JLabel("panneau droite");
		getContentPane().add(label2, BorderLayout.EAST);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		label1.setText(e.getActionCommand());
		Case b = (Case) e.getSource();
		b.SetColor(100, 95, 0);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Terrain();
	}
}