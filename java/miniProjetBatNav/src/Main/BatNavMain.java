package Main;

import Controler.BatNavControler;
import Model.GlobalModel;
import View.GlobalView;

public class BatNavMain {
	public static void main(String[] args) {
		
		/* Contient le modele */
		GlobalModel model = new GlobalModel();

		/* Contient la vue */
		GlobalView view = new GlobalView();		

		/* Contient le controleur */
		BatNavControler controler = new BatNavControler();

		/* Pour que le controleur connaisse le modele */
		controler.setModele(model);

		/* Pour que la vue connaisse le modele */
		view.setModele(model);

		/* Le controleur recevra les action de la vue */
		view.setListener(controler);

		/* La vue observera le modèle */
		model.addObserver(view);

		/* Et bien sure on affiche la vue */
		view.affiche();
	}
		
}
