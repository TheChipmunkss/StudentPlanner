package Main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class mainFen extends JFrame {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable tableau;
	private JButton change = new JButton("Changer la taille");
	private String[] comboData = {"test","test","test"};
	private String autres = "Autres";
	private JComboBox combo;
	
	public mainFen() { //Création de la fenêtre
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("JTable");
		this.setSize(600, 250);
		this.createContent();
	}
	
	private void createContent() {
		
		Object[][] data = {
				{new Boolean(true), comboData[0] , " ", "Projets"},
				{new Boolean(true),comboData[0]," " , "Devoirs Maisons"},
				{new Boolean(true),comboData[0], " ", "Nourrit ton cerveau"},
				{new Boolean(true),comboData[0], " ", "Méditation"},
				{new Boolean(true),comboData[0], " ", "Planning"}
			};
		
		String title[] = {" " , "A Faire" , "Calendrier ?" , "Autres" };
		combo = new JComboBox(comboData);

		
		//Modèle d'affichage pour pallier au bugs d'affichage
		ZModel zModel = new ZModel(data, title);
		
		this.tableau = new JTable(zModel);//Création des tableaux
		this.tableau.setRowHeight(30);
		this.tableau.getColumn("Autres").setCellRenderer(new ButtonRenderer());
		this.tableau.getColumn("Autres").setCellEditor(new ButtonEditor(new JCheckBox()));
		
		this.tableau.setRowHeight(30);
		this.tableau.getColumn(" ").setCellEditor(new DefaultCellEditor(combo));
		DefaultTableCellRenderer dcr = new DefaultTableCellRenderer();
		this.tableau.getColumn(" ").setCellRenderer(dcr);
		
		this.getContentPane().add(new JScrollPane(tableau), BorderLayout.CENTER);
	}
	
	public void actionPerformed(ActionEvent arg0) {
		//Clique bouton ouvre une autre fenêtre
		this.dispose();
		Projets fen = new Projets();
	}
	

	public static void main(String[] args) {
		mainFen fen = new mainFen();
		fen.setVisible(true);
		}
	}

