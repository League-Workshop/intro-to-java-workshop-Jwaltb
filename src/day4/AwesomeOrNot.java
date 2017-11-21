package day4;

import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
Random r=new Random();
int x=r.nextInt(4);
	// 3. Print out this variable
System.out.println(x);
	// 4. Get the user to enter something that they think is awesome
String awesome=JOptionPane.showInputDialog("What do you think is awesome?");
	// 5. If the random number is 0
if(x==0) {
	// -- tell the user whatever they entered is awesome!
JOptionPane.showMessageDialog(null, awesome+" is awesome!");}
	// 6. If the random number is 1
else if(x==1) {
	// -- tell the user whatever they entered is ok.
JOptionPane.showMessageDialog(null, awesome+"is ok");}
	// 7. If the random number is 2
else if(x==2) {
	// -- tell the user whatever they entered is boring.
JOptionPane.showMessageDialog(null, awesome+" is boring");}
	// 8. If the random number is 3
else if(x==3) {
	// -- write your own answer
JOptionPane.showMessageDialog(null, awesome+" is wack");}
}
}

