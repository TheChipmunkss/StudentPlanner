package connexion;

import javax.swing.JFrame;

public class simpleFenetre extends JFrame{
		/**
	 * 
	 */
	private static final long serialVersionUID = 2013687804306890656L;
		public simpleFenetre() {
			super();
			
			build(); //initialisation de la fenêtre
		}
		private void build() {
			setTitle("Student Planner");
			setSize (1000,800);
			setLocationRelativeTo(null); //centre la fenêtre sur l'écran
			setResizable(false); //Interdit de redimensionner la fenêtre
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fermer la fenêtre lorsque l'on clique sur la croix
		}
	}
	



