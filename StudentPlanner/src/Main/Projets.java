package Main;

import javax.swing.JFrame;

public class Projets extends JFrame {
	
	public Projets() {
		super();
		
		build(); //initialisation de la fen�tre
	}
	private void build() {
		setTitle("Student Planner");
		setSize (1000,800);
		setLocationRelativeTo(null); //centre la fen�tre sur l'�cran
		setResizable(false); //Interdit de redimensionner la fen�tre
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fermer la fen�tre lorsque l'on clique sur la croix
		
	}
	
	

}
