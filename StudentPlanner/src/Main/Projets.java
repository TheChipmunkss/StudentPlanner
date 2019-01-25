package Main;

import javax.swing.JFrame;

public class Projets extends JFrame {
	
	public Projets() {
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
