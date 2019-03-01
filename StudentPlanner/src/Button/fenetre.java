package Button;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;



public class fenetre extends JFrame{
	
	JButton project = new JButton("PROJETS");
	JButton dm = new JButton("DEVOIRS MAISONS");
	JButton ntc = new JButton("NOURRIT TON CERVEAU");
	JButton meditation = new JButton("MEDITATION");
	JButton planning = new JButton("PLANNING");
	
	JPanel jp = new JPanel();
	
	GridBagLayout gb = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	
	
	public fenetre() {
		super();
		this.setTitle("Student Planner");
		this.setSize(1200,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(gb);
		
		
		
		gbc.anchor = GridBagConstraints.ABOVE_BASELINE_TRAILING;
		gbc.fill = GridBagConstraints.VERTICAL;
		gbc.weightx = 1;
		gbc.weighty = 1;
		gbc.gridx = 0;
		gbc.ipadx = 0;
		gb.setConstraints(project, gbc);
		
		gb.setConstraints(dm, gbc);
		
		gb.setConstraints(ntc, gbc);
		
		gb.setConstraints(meditation, gbc);
		
		gb.setConstraints(planning, gbc);
		
		
		project.setIcon(new ImageIcon("F://images//projet.jpg"));
		project.setVerticalTextPosition(SwingConstants.CENTER);
		project.setHorizontalTextPosition(SwingConstants.CENTER);
		project.setPressedIcon(new ImageIcon("F://images//projet.jpg"));
		project.setDisabledIcon(new ImageIcon("F://images//projet.jpg"));
		project.setBorderPainted(false);
		project.setFocusPainted(false);
		project.doClick();
		project.setBackground(Color.WHITE);
		project.setForeground(Color.BLACK);
		project.setBorder(BorderFactory.createLineBorder(Color.RED));
		project.addMouseListener(new MouseListener(){
		public void mouseClicked(MouseEvent e) {}
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {
			project.setBorder(BorderFactory.createLineBorder(Color.RED));
		}
		public void mouseExited(MouseEvent e) {
			project.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		}
		});
		jp.add(project);
		getContentPane().add(project);
		
		dm.setIcon(new ImageIcon("F://images//dm.jpg"));
		dm.setVerticalTextPosition(SwingConstants.CENTER);
		dm.setHorizontalTextPosition(SwingConstants.CENTER);
		dm.setPressedIcon(new ImageIcon("F://images//dm.jpg"));
		dm.setDisabledIcon(new ImageIcon("F://images//dm.jpg"));
		dm.setBorderPainted(false);
		dm.setFocusPainted(false);
		dm.doClick();
		dm.setBackground(Color.WHITE);
		dm.setForeground(Color.BLACK);
		dm.setBorder(BorderFactory.createLineBorder(Color.RED));
		dm.addMouseListener(new MouseListener(){
		public void mouseClicked(MouseEvent e) {}
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {
			dm.setBorder(BorderFactory.createLineBorder(Color.RED));
		}
		public void mouseExited(MouseEvent e) {
			dm.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		}
		});
		jp.add(dm);
		getContentPane().add(dm);
		
		ntc.setIcon(new ImageIcon("F://images//ntc.jpg"));
		ntc.setVerticalTextPosition(SwingConstants.CENTER);
		ntc.setHorizontalTextPosition(SwingConstants.CENTER);
		ntc.setPressedIcon(new ImageIcon("F://images//ntc.jpg"));
		ntc.setDisabledIcon(new ImageIcon("F://images//ntc.jpg"));
		ntc.setBorderPainted(false);
		ntc.setFocusPainted(false);
		ntc.doClick();
		ntc.setBackground(Color.WHITE);
		ntc.setForeground(Color.BLACK);
		ntc.setBorder(BorderFactory.createLineBorder(Color.RED));
		ntc.addMouseListener(new MouseListener(){
		public void mouseClicked(MouseEvent e) {}
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {
			ntc.setBorder(BorderFactory.createLineBorder(Color.RED));
		}
		public void mouseExited(MouseEvent e) {
			ntc.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		}
		});
		jp.add(ntc);
		getContentPane().add(ntc);
		
		meditation.setIcon(new ImageIcon("F://images//meditation.jpg"));
		meditation.setVerticalTextPosition(SwingConstants.CENTER);
		meditation.setHorizontalTextPosition(SwingConstants.CENTER);
		meditation.setPressedIcon(new ImageIcon("F://images//meditation.jpg"));
		meditation.setDisabledIcon(new ImageIcon("F://images//meditation.jpg"));
		meditation.setBorderPainted(false);
		meditation.setFocusPainted(false);
		meditation.doClick();
		meditation.setBackground(Color.WHITE);
		meditation.setForeground(Color.BLACK);
		meditation.setBorder(BorderFactory.createLineBorder(Color.RED));
		meditation.addMouseListener(new MouseListener(){
		public void mouseClicked(MouseEvent e) {}
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {
			meditation.setBorder(BorderFactory.createLineBorder(Color.RED));
		}
		public void mouseExited(MouseEvent e) {
			meditation.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		}
		});
		jp.add(meditation);
		getContentPane().add(meditation);
		
		planning.setIcon(new ImageIcon("F://images//planning.jpg"));
		planning.setVerticalTextPosition(SwingConstants.CENTER);
		planning.setHorizontalTextPosition(SwingConstants.CENTER);
		planning.setPressedIcon(new ImageIcon("F://images//planning.jpg"));
		planning.setDisabledIcon(new ImageIcon("F://images//planning.jpg"));
		planning.setBorderPainted(false);
		planning.setFocusPainted(false);
		planning.doClick();
		planning.setBackground(Color.WHITE);
		planning.setForeground(Color.BLACK);
		planning.setBorder(BorderFactory.createLineBorder(Color.RED));
		planning.addMouseListener(new MouseListener(){
		public void mouseClicked(MouseEvent e) {}
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {
			planning.setBorder(BorderFactory.createLineBorder(Color.RED));
		}
		public void mouseExited(MouseEvent e) {
			planning.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		}
		});
		jp.add(planning);
		getContentPane().add(planning);
		
		validate();
		
		getContentPane().setBackground(Color.WHITE);
		
		this.setVisible(true);
	}	
	
}
