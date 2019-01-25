package project2019;

import java.awt.Color;
import java.time.Duration;
import java.util.Timer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javafx.scene.shape.Circle;

//import javafx.animation.TranslateTransition;


@SuppressWarnings("restriction")
public class timer {{
	JFrame ma_timeuse= new JFrame();
	ma_timeuse.getDefaultCloseOperation();
	ma_timeuse.setSize(50, 70);
	ma_timeuse.setVisible(true);
	
	Circle cir= new Circle();
	cir.setFill(Color.MAGENTA);
	cir.setRadius(30);
	cir.setLayoutX(10);
	cir.setLayoutX(7);
	
	TranslateTransition transition= new TranslateTransition();
	transition.setToX(500);
	transition.setDuration(Duration.ofSeconds(3000));
	
	
	
	ma_timeuse.repaint();
	
	
}}
