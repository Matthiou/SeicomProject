package Controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import Model.BatNavModel;
//import View.BatNavView;


public class BatNavControler implements ActionListener, WindowListener {
	
	private BatNavModel model;
	//private BatNavView view;

	public BatNavControler() {
		model = null;
		//view = null;
	}

	/* Permettra de connaitre le modéle */
	public void setModele(BatNavModel m) {
		model = m;
	}
	
	/* Permettra de connaitre la vue */
//	public void setVue(BatNavView v) {
//		view = v;
//	}
	
	/* ActionListener implémentation */
	public void actionPerformed(ActionEvent e) {
		String str;
		str=e.getActionCommand();
		model.Compare(str);
	}
	

	

	/* WindowListener implémentation : pour fermer l'application avec la fenêtre */
	public void windowActivated(WindowEvent e) {
	}

	public void windowClosed(WindowEvent e) {
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public void windowDeactivated(WindowEvent e) {
	}

	public void windowDeiconified(WindowEvent e) {
	}

	public void windowIconified(WindowEvent e) {
	}

	public void windowOpened(WindowEvent e) {
	}
}
