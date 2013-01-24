package Main;

import Controler.BatNavControler;
import Model.BatNavModel;
import View.BatNavView;

public class BatNavMain {
	public static void main(String[] args) {
		
		/* Contient le modele */
		BatNavModel model = new BatNavModel();

		/* Contient la vue */
		BatNavView view = new BatNavView();		

		/* Contient le controleur */
		BatNavControler controler = new BatNavControler();

		/* Pour que le controleur connaisse le modele */
		controler.setModele(model);

		/* Pour que le controleur connaisse la vue */
//		controler.setVue(view);

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
