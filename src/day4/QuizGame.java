package day4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score=0;
		// 2.  Ask the user a question 
		String answer=JOptionPane.showInputDialog("You have a fox, a chicken and a sack of grain. You must cross a river with only one of them at a time. If you leave the fox with the chicken he will eat it; if you leave the chicken with the grain he will eat it. How can you get all three across safely?");
		// 3.  Use an if statement to check if their answer is correct
		if(answer.equalsIgnoreCase("")) {
		// 4.  if the user's answer is correct
		score+=1;
		// -- add one to their score 
		}
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		answer=JOptionPane.showInputDialog("");
		if(answer.equalsIgnoreCase("")) {
			score+=1;
		}
		// 6.  After all the questions have been asked, print the user's score 
		answer=JOptionPane.showInputDialog("What pixar movie will Rick Astley never give you?");
		if(answer.equalsIgnoreCase("up")) {
			score+=1;
		}System.out.println(score);
	}
}
