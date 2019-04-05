package SP;

import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

import javax.swing.*;
import SP.DatePicker;
import javax.swing.border.EmptyBorder;

public class planning extends JFrame {
	
	public planning() {

		super();
		this.setTitle("Planning");
		//this.setSize(1000,900);
		this.setLocationRelativeTo(null);

		//set close operation on frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//set bounds of frame
		this.setBounds(100, 100, 800, 600);
		
		JPanel contentPane = new JPanel();
		//set border of frame
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel aFaire= new JLabel();
		aFaire.setText("Travail à faire: ");
		aFaire.setBounds(10, 35, 120,20);
		contentPane.add(aFaire);
		
		//create text field
		//JTextField txtDate = new JTextField();
		JLabel txtDate = new JLabel();
		//set bounds of text field
		txtDate.setBounds(223, 10, 120, 20);
		//add text field to contentPane
		contentPane.add(txtDate);
		//set columns
		//txtDate.setColumns(10);
		
		//create button and there object
		JButton btnNewButton = new JButton("Selectionner date");
		
		//perform action listener
		btnNewButton.addActionListener(new ActionListener() 
		{	
			//performed action
			public void actionPerformed(ActionEvent arg0) 
			{
				//create frame new object  f
				final JFrame f = new JFrame();
				//set text which is collected by date picker i.e. set date 
				txtDate.setText(new DatePicker(f).setPickedDate());
				
		        //JOptionPane.showMessageDialog(null, "txtDate text is >"+txtDate.getText()+"<");
				
				Vector<String> vecList = studentPlannerDB.getTasksByDate( txtDate.getText() );
				JList<String> list = new JList<String>(vecList); // create Jlist from Vector
				JScrollPane scrollPane = new JScrollPane(list);
				scrollPane.setBounds(10, 70,500,200);
				contentPane.add(scrollPane); 
				
				//JOptionPane.showMessageDialog(null, vecList.size() );

			}
		});
		//set button bound
		btnNewButton.setBounds(10, 10, 200, 23);
		//add button in contentPane
		contentPane.add(btnNewButton);
		
		this.setVisible(true);
	}
	
	//private JTextField txtDate;
	public static void main(String[] args)// main method
	{	// it will call the run method on that object
		EventQueue.invokeLater(new Runnable()
		{	
			public void run()
			{
				try // try block 
				{
				     //create frame object
				     planning frame = new planning();
				     frame.setVisible(true);//set visible true
			        }
			        catch (Exception e) //catch the exception
			        {
			         	e.printStackTrace();
			        }
		        }          
	        });
    }

}

