package View;

import java.awt.BorderLayout;
import java.util.EventListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JFrame;
import Model.BatNavModel;
import View.BatNavView;

public class GlobalView implements Observer{
	
	private JFrame globalView;
	private BatNavView joueur1;
	private BatNavView joueur2;	
	
	

	public GlobalView(){
		globalView = new JFrame();
		globalView.getContentPane().setLayout(new BorderLayout());
		
		BatNavView joueur1 = new BatNavView();
		BatNavView joueur2 = new BatNavView();
		
		globalView.getContentPane().add(joueur1, BorderLayout.EAST);
		globalView.getContentPane().add(joueur2, BorderLayout.WEST);
		
		globalView.setSize(800, 600);
		globalView.setTitle("touche...coule");
		
	}
	
	public void affiche() {
		globalView.setVisible(true);
	}
	
	public void setModele(BatNavModel m) {
		joueur1.setModele(m);
		joueur2.setModele(m);
	}
	
	public void setListener(EventListener al) {
		joueur1.setListener(al);
		joueur2.setListener(al);

	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		joueur1.update(o, arg);
		joueur2.update(o, arg);

	}
}
