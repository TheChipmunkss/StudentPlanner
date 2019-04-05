package connexion;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.io.File;
import java.io.IOException;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Desktop;  

public class nourrir extends JFrame{
	

		JButton pat = new JButton("Pâtes au thon");
		JButton riz = new JButton ("Riz au légumes");
		JButton soupe = new JButton ("Soupe");
		JButton omelette = new JButton ("Omelette"); 
		JButton quiche = new JButton ("Quiche");
		JButton steak = new JButton ("Steak");
		JButton purée = new JButton ("Purée saucisse");
		JButton mix = new JButton ("Mélange de Papa");
		JButton gratin = new JButton ("Gratin de pâtes");
		JButton vegi = new JButton ("Recette Végie");
		
		
		
		
		
		JPanel jp = new JPanel();
		
		GridBagLayout gb = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		
		public nourrir() {

			super();
			this.setTitle("Se nourrir");
			this.setSize(1000,700);// hauteur de 600
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setLocationRelativeTo(null);
			this.setLayout(gb);
			
			gbc.anchor = GridBagConstraints.PAGE_START;
			//gbc.fill = GridBagConstraints.VERTICAL;
			gbc.fill = GridBagConstraints.BOTH;
			gbc.weightx = 1;
			gbc.weighty = 1;
			gbc.gridx = 0;
			gbc.ipadx = 0;
			gb.setConstraints(pat,gbc);
			
			pat.setIcon(new ImageIcon("/Volumes/ISN 06/Photo/pate.jpg"));
			
			pat.setVerticalTextPosition(SwingConstants.CENTER);
			pat.setHorizontalTextPosition(SwingConstants.CENTER);
				
			try {
				Desktop.getDesktop().open(new File("/Volumes/ISN 06/Recette pdf/Pâtes au thon.pdf"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
					
			
			jp.add(pat);
			getContentPane().add(pat);
			this.setVisible(true);  
			
			
			// Bouton 2
			
			gb.setConstraints(riz,gbc);
		
			riz.setIcon(new ImageIcon("/Volumes/ISN O6/Photo/Riz.jpeg"));
			riz.setVerticalTextPosition(SwingConstants.CENTER);
			riz.setHorizontalTextPosition(SwingConstants.CENTER);
			try {
				Desktop.getDesktop().open(new File("/Volumes/ISN 06/Recette pdf/Riz au légumes.pdf"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			jp.add(riz);
			getContentPane().add(riz);
			
			this.setVisible(true); 
	 
			// Bouton 3
			
			gb.setConstraints(soupe,gbc);
			
			soupe.setIcon(new ImageIcon("/Volumes/ISN O6/Photo/soupe.jpg"));
			soupe.setVerticalTextPosition(SwingConstants.CENTER);
			soupe.setHorizontalTextPosition(SwingConstants.CENTER);
		
			try {
				Desktop.getDesktop().open(new File("/Volumes/ISN 06/Recette pdf/Soupe.pdf"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			jp.add(soupe);
			getContentPane().add(soupe);
			
			this.setVisible(true); 
		
			//Bouton 4 
			gb.setConstraints(omelette,gbc);
			
			omelette.setIcon(new ImageIcon("/Volumes/ISN 06/Photo/omel.jpg"));
			omelette.setVerticalTextPosition(SwingConstants.CENTER);
			omelette.setHorizontalTextPosition(SwingConstants.CENTER);
			
			jp.add(omelette);
			getContentPane().add(omelette);
			
			this.setVisible(true); 
			
			//Bouton 5

			gb.setConstraints(quiche,gbc);
			
			quiche.setIcon(new ImageIcon("/Volumes/ISN 06/Photo/quiche.jpg"));
			quiche.setVerticalTextPosition(SwingConstants.CENTER);
			quiche.setHorizontalTextPosition(SwingConstants.CENTER);
			
			jp.add(quiche);
			getContentPane().add(quiche);
			
			this.setVisible(true);
			
			//Bouton 6 
			gb.setConstraints(steak,gbc);
			
			steak.setIcon(new ImageIcon("/Volumes/ISN 06/Photo/quiche.jpg"));
			steak.setVerticalTextPosition(SwingConstants.CENTER);
			steak.setHorizontalTextPosition(SwingConstants.CENTER);
			
			jp.add(steak);
			getContentPane().add(steak);
			this.setVisible(true);
			//Bouton 7 
			gb.setConstraints(purée,gbc);
			
			purée.setIcon(new ImageIcon("/Volumes/ISN 06/Photo/quiche.jpg"));
			purée.setVerticalTextPosition(SwingConstants.CENTER);
			purée.setHorizontalTextPosition(SwingConstants.CENTER);
			
			jp.add(purée);
			getContentPane().add(purée);
			this.setVisible(true);
			//Bouton 8 
			gb.setConstraints(mix,gbc);
			
			mix.setIcon(new ImageIcon("/Volumes/ISN 06/Photo/omel.jpg"));
			mix.setVerticalTextPosition(SwingConstants.CENTER);
			mix.setHorizontalTextPosition(SwingConstants.CENTER);
			
			jp.add(mix);
			getContentPane().add(mix);
			
			this.setVisible(true);
			
			//Bouton 9 
			gb.setConstraints(gratin,gbc);
			
			gratin.setIcon(new ImageIcon("/Volumes/ISN 06/Photo/omel.jpg"));
			gratin.setVerticalTextPosition(SwingConstants.CENTER);
			gratin.setHorizontalTextPosition(SwingConstants.CENTER);
			
			jp.add(gratin);
			getContentPane().add(gratin);
			
			this.setVisible(true);
			
			//Bouton 10 
			gb.setConstraints(vegi,gbc);
			
			vegi.setIcon(new ImageIcon("/Volumes/ISN 06/Photo/omel.jpg"));
			vegi.setVerticalTextPosition(SwingConstants.CENTER);
			vegi.setHorizontalTextPosition(SwingConstants.CENTER);
			
			jp.add(vegi);
			getContentPane().add(vegi);
			
			this.setVisible(true);
			
			
			
			
		
		}
		
		private void open(File file) {
			// TODO Auto-generated method stub
			
		}

		public static void main(String[] args) {
			nourrir nourrir = new nourrir();
			
		}
		
		
		
		// faire dix recettes
		
		
		
		
		
		
		
		
		
	
	}
		
		
	
	
		    
	    

	
	
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	



