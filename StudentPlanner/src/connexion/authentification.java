package connexion;

import javax.swing.SwingUtilities;


public class authentification {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				
				simpleFenetre fenetre = new simpleFenetre();
				fenetre.setVisible(true);
				
				
			}
		});
		
	}
}


	


