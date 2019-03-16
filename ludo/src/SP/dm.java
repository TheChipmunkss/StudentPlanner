package SP;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class dm extends JFrame{
	
	JButton buttonAjouter = new JButton("Ajouter");
	JLabel labelDescription = new JLabel("Description:", SwingConstants.CENTER);
	JTextField fieldDescription = new JTextField(80);
	JLabel labelDueDate = new JLabel("Date du (ex 2019-01-29):", SwingConstants.CENTER);
	JTextField fieldDueDate = new JTextField(10);	
	
	public dm() {
		super();
		this.setTitle("Devoirs Maisons");
		this.setSize(900,600);
		this.setLocationRelativeTo(null);

		JPanel panel = new JPanel(); // contient tous les objets à afficher
		
		panel.setLayout( new GridBagLayout() );
		GridBagConstraints c = new GridBagConstraints();
		
		// A ajouter la liste des DM existants
		Vector<String> vecList = studentPlannerDB.getTasks("DM");
		JList<String> list = new JList<String>(vecList); // create Jlist from Vector
		JScrollPane scrollPane = new JScrollPane(list);
		
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 3;
		panel.add(scrollPane, c); 

		c.gridwidth = 1;		
		
		c.gridx = 0;
		c.gridy = 1;
		panel.add(labelDescription, c);

		c.gridx = 1;
		c.gridy = 1;		
		panel.add(fieldDescription, c);

		c.gridx = 0;
		c.gridy = 2;
		panel.add(labelDueDate, c);

		c.gridx = 1;
		c.gridy = 2;		
		panel.add(fieldDueDate, c);

		c.gridx = 2;
		c.gridy = 2;			
        panel.add(buttonAjouter, c);
        
        this.getContentPane().add(panel);
        pack();
        
        buttonAjouter.addActionListener(new BoutonListener());

		this.setVisible(true);
	}
	
	class BoutonListener implements ActionListener{
		
		public void actionPerformed(ActionEvent arg0) {
			studentPlannerDB.insertTask("DM", fieldDescription.getText(), fieldDueDate.getText());
			JOptionPane.showMessageDialog(null, "Devoir maison créé");
		}
	}	
	
}