package SP;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;



public class fenetre extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//Cr�ation des boutons
	JButton project = new JButton("PROJETS");
	JButton dm = new JButton("DEVOIRS MAISONS");
	JButton ntc = new JButton("NOURRIT TON CERVEAU");
	JButton planning = new JButton("PLANNING");
	JButton minuteur = new JButton("Minuteur");
	
	JPanel jp = new JPanel(); //Cr�ation du JPanel
	
	GridBagLayout gb = new GridBagLayout(); //Cr�ation du GridBagLayout
	GridBagConstraints gbc = new GridBagConstraints(); //Cr�ation du GridBagConstraints
	
	//Cr�ation de la fen�tre
	public fenetre() {
		super();
		this.setTitle("Student Planner");
		this.setSize(900,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setLayout(gb);
		
		//Position des boutons
		gbc.anchor = GridBagConstraints.ABOVE_BASELINE_TRAILING;
		gbc.fill = GridBagConstraints.VERTICAL;
		gbc.weightx = 1;
		gbc.weighty = 1;
		gbc.gridx = 0;
		gbc.ipadx = 0;
		gb.setConstraints(project, gbc);
		gb.setConstraints(dm, gbc);
		gb.setConstraints(ntc, gbc);
		gb.setConstraints(planning, gbc);
		gbc.anchor = GridBagConstraints.PAGE_START;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.insets = new Insets(0,0,58,0);
		
		gb.setConstraints(minuteur, gbc);
		
		
		
		
		
		//Bouton Projets
		project.setIcon(new ImageIcon(getClass().getClassLoader().getResource("projet.jpg"))); //Image comme bouton
		project.setVerticalTextPosition(SwingConstants.CENTER); //texte au centre
		project.setHorizontalTextPosition(SwingConstants.CENTER); //same
		project.setPressedIcon(new ImageIcon(getClass().getClassLoader().getResource("projet.jpg")));//Image lorsque l'on presse le bouton
		project.setDisabledIcon(new ImageIcon(getClass().getClassLoader().getResource("projet.jpg")));//Image lorque l'on ne fait rien
		project.setBorderPainted(true);//Initialisation de la bordure
		project.setFocusPainted(true);//Same
		project.doClick();//Comme c'est �crit c'est le clic
		project.setBackground(Color.WHITE);//Couleur de fond blanc
		project.setForeground(Color.BLACK);//Couleur du texte noir
		project.setBorder(BorderFactory.createLineBorder(Color.BLACK));//Couleur de la bordure noir
			
			project.addMouseListener(new MouseListener(){
				public void mouseClicked(MouseEvent e) {}
				public void mousePressed(MouseEvent e) {}
				public void mouseReleased(MouseEvent e) {}
				public void mouseEntered(MouseEvent e) {
					project.setBorder(BorderFactory.createLineBorder(Color.gray));//Couleur de la bordure lorsque l'on passe la souris dessus gris
					}
				public void mouseExited(MouseEvent e) {
					project.setBorder(BorderFactory.createLineBorder(Color.BLACK));//Couleur lorsque que l'on ne passe plus la souris dessus
				}
			});
		jp.add(project);//Ajoute le bouton au panel
		getContentPane().add(project);//Affiche le bouton avec toutes les modifs
		
		
		//Bouton Devoir Maison
		dm.setIcon(new ImageIcon(getClass().getClassLoader().getResource("dm.jpg")));
		dm.setVerticalTextPosition(SwingConstants.CENTER);
		dm.setHorizontalTextPosition(SwingConstants.CENTER);
		dm.setPressedIcon(new ImageIcon(getClass().getClassLoader().getResource("dm.jpg")));
		dm.setDisabledIcon(new ImageIcon(getClass().getClassLoader().getResource("dm.jpg")));
		dm.setBorderPainted(true);
		dm.setFocusPainted(true);
		dm.doClick();
		dm.setBackground(Color.WHITE);
		dm.setForeground(Color.BLACK);
		dm.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
			dm.addMouseListener(new MouseListener(){
				public void mouseClicked(MouseEvent e) {}
				public void mousePressed(MouseEvent e) {}
				public void mouseReleased(MouseEvent e) {}
				public void mouseEntered(MouseEvent e) {
					dm.setBorder(BorderFactory.createLineBorder(Color.gray));
				}
				public void mouseExited(MouseEvent e) {
					dm.setBorder(BorderFactory.createLineBorder(Color.BLACK));
				}
			});
		jp.add(dm);
		getContentPane().add(dm);
		
		
		//Bouton Nourrit ton cerveau
		ntc.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ntc.jpg")));
		ntc.setVerticalTextPosition(SwingConstants.CENTER);
		ntc.setHorizontalTextPosition(SwingConstants.CENTER);
		ntc.setPressedIcon(new ImageIcon(getClass().getClassLoader().getResource("ntc.jpg")));
		ntc.setDisabledIcon(new ImageIcon(getClass().getClassLoader().getResource("ntc.jpg")));
		ntc.setBorderPainted(true);
		ntc.setFocusPainted(true);
		ntc.doClick();
		ntc.setBackground(Color.WHITE);
		ntc.setForeground(Color.BLACK);
		ntc.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
			ntc.addMouseListener(new MouseListener(){
				public void mouseClicked(MouseEvent e) {}
				public void mousePressed(MouseEvent e) {}
				public void mouseReleased(MouseEvent e) {}
				public void mouseEntered(MouseEvent e) {
					ntc.setBorder(BorderFactory.createLineBorder(Color.gray));
				}
				public void mouseExited(MouseEvent e) {
					ntc.setBorder(BorderFactory.createLineBorder(Color.BLACK));
				}
			});
		jp.add(ntc);
		getContentPane().add(ntc);
		
		
		//Bouton Planning
		planning.setIcon(new ImageIcon(getClass().getClassLoader().getResource("planning.jpg")));
		planning.setVerticalTextPosition(SwingConstants.CENTER);
		planning.setHorizontalTextPosition(SwingConstants.CENTER);
		planning.setPressedIcon(new ImageIcon(getClass().getClassLoader().getResource("planning.jpg")));
		planning.setDisabledIcon(new ImageIcon(getClass().getClassLoader().getResource("planning.jpg")));
		planning.setBorderPainted(true);
		planning.setFocusPainted(true);
		planning.doClick();
		planning.setBackground(Color.WHITE);
		planning.setForeground(Color.BLACK);
		planning.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
			planning.addMouseListener(new MouseListener(){
					public void mouseClicked(MouseEvent e) {}
					public void mousePressed(MouseEvent e) {}
					public void mouseReleased(MouseEvent e) {}
					public void mouseEntered(MouseEvent e) {
						planning.setBorder(BorderFactory.createLineBorder(Color.gray));
					}
					public void mouseExited(MouseEvent e) {
						planning.setBorder(BorderFactory.createLineBorder(Color.BLACK));
					}
			});
		jp.add(planning);
		getContentPane().add(planning);
		
		//Bouton Minuteur
		minuteur.setIcon(new ImageIcon(getClass().getClassLoader().getResource("minuteur.png"))); 
		minuteur.setVerticalTextPosition(SwingConstants.CENTER);
		minuteur.setHorizontalTextPosition(SwingConstants.CENTER);
		minuteur.setPressedIcon(new ImageIcon(getClass().getClassLoader().getResource("minuteur.png")));
		minuteur.setDisabledIcon(new ImageIcon(getClass().getClassLoader().getResource("minuteur.png")));
		minuteur.setBorderPainted(true);
		minuteur.setFocusPainted(true);
		minuteur.doClick();
		minuteur.setBackground(Color.WHITE);
		minuteur.setForeground(Color.BLACK);
		minuteur.setBorder(BorderFactory.createLineBorder(Color.RED));
			minuteur.addMouseListener(new MouseListener(){
				public void mouseClicked(MouseEvent e) {}
				public void mousePressed(MouseEvent e) {}
				public void mouseReleased(MouseEvent e) {}
				public void mouseEntered(MouseEvent e) {
					minuteur.setBorder(BorderFactory.createLineBorder(Color.RED));
				}
				public void mouseExited(MouseEvent e) {
					minuteur.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				}
			});
		jp.add(minuteur);
		getContentPane().add(minuteur);
		
		validate();
		
		getContentPane().setBackground(Color.WHITE);
		
		//Initialisation des Action Listener
		project.addActionListener(new BoutonListener());
		dm.addActionListener(new Bouton2Listener());
		ntc.addActionListener(new Bouton3Listener());
		planning.addActionListener(new Bouton4Listener());
		minuteur.addActionListener(new Bouton5Listener());
		
		//On affiche la fen�tre
		this.setVisible(true);
		go();
	}	
	private void go() {
}
	
	//Cr�ation des classe �coutant les boutons
	//Permet d'ouvrir les fenetres en cliquant sur un bouton
	
	class BoutonListener implements ActionListener{
		
		public void actionPerformed(ActionEvent arg0) {
			Project Project = new Project();
		}
	}
	
	class Bouton2Listener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			dm dm = new dm();
		}
	}
	class Bouton3Listener implements ActionListener{
		
	
		public void actionPerformed(ActionEvent e1) {
			ntc ntc = new ntc();
		}
	}
	
	class Bouton4Listener implements ActionListener{
		
		public void actionPerformed(ActionEvent e2) {
			planning planning = new planning();
		}
	}

	class Bouton5Listener implements ActionListener{
		
		public void actionPerformed(ActionEvent e3) {
			minuteur minuteur = new minuteur();
		}
	}

	
	public void actionPerformed(ActionEvent e) {  //Permet d'enlever l'erreur sur le public class fenetre
		
	}
}
	