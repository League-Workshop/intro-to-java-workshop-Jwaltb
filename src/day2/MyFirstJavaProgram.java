package day2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
		Robot Timmy=new Robot();
		Timmy.setPenColor(Color.CYAN);
		Timmy.setPenWidth(50);
		Timmy.sparkle();
		Timmy.penDown();
		Timmy.setSpeed(1);
	Timmy.move(100);
		Timmy.turn(90);	
		
		
	}
}
