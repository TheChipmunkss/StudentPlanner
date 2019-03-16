package SP;

//import javax.swing.JFrame;
import javax.swing.*;

import SP.dm.BoutonListener;

import java.util.Timer; 
import java.util.TimerTask;

public class minuteur extends JFrame {
	
	JTextField textField = new JTextField();
	JPanel panel = new JPanel();
	
	int counter = 3000; // secondes à descendre
	Timer timer = new Timer();
	
	public minuteur() {
		super();
		this.setTitle("Minuteur");
		this.setSize(500, 60);
		
		this.setLocationRelativeTo(null);

		textField.setText("Countdown va démarrer");	
		textField.setSize(1000, 2000);
		panel.add(textField); 	
		panel.setSize(20000000, 50000);
		this.getContentPane().add(panel);
       // pack();
			
		timer.schedule(new DisplayCountdown(), 0, 1000);
	
		this.setVisible(true);
	}
	
	class DisplayCountdown extends TimerTask { 
		@Override
		public void run() {; 
			counter--;
			textField.setText("Minutes restantes avant pause de 10min: " + counter/60);		
			if (counter==0) {
				JOptionPane.showMessageDialog(null, "Faut faire une pause de 10min!");
				timer.cancel();
				textField.setText("Faut faire une pause de 10min!");
			}
		} 
		
	}

}