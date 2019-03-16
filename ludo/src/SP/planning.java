
package SP;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import SP.DatePicker;



public class planning extends JFrame {
	public planning() {
		super();
		this.setTitle("Planning");
		this.setSize(900,600);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	//add JPanel to the contentPane
	private JPanel contentPane;
	//declare variable
	private JTextField txtDate1;

 
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
	public void createframe(){
	
	//JFrame trywind= new JFrame();
	//set close operation on frame
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//set bounds of frame
	this.setBounds(100, 100, 450, 300);
	//create new JPanel in contentPane
	contentPane = new JPanel();
	//set border of frame
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	//set contentPane 
	setContentPane(contentPane);
	//set layout null
	contentPane.setLayout(null);
	
	//create text field
	JTextField txtDate = new JTextField();
	//set bounds of text field
	txtDate.setBounds(101, 107, 86, 20);
	//add text field to contentPane
	contentPane.add(txtDate);
	//set columns
	txtDate.setColumns(10);
	
	//create button and there object
	JButton btnNewButton = new JButton("New button");
	//perform action listener
	btnNewButton.addActionListener(new ActionListener() 
	{	
		//performed action
		public void actionPerformed(ActionEvent arg0) 
		{
			//create frame new object  f
			final JFrame f = new JFrame();
			//set text which is collected by date picker i.e. set date 
			txtDate1.setText(new DatePicker(f).setPickedDate());
		}
	});
	//set button bound
	btnNewButton.setBounds(223, 106, 27, 23);
	//add button in contentPane
	contentPane.add(btnNewButton);
}

	
		
}

