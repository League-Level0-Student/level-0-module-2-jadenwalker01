package random;
import java.util.Random;

import javax.swing.JOptionPane;
public class Loterynumber {
public static void main(String[] args) {
	
	Random randomnum1 = new Random(); 
	int num1;
	num1 = randomnum1.nextInt(61);
	
	Random randomnum2 = new Random(); 
	int num2;
	num2 = randomnum2.nextInt(61);
	
	Random randomnum3 = new Random(); 
	int num3;
	num3 = randomnum3.nextInt(61);
	
	Random randomnum4 = new Random(); 
	int num4;
	num4 = randomnum4.nextInt(61);
	
	Random randomnum5 = new Random(); 
	int num5;
	num5 = randomnum5.nextInt(61);
	
	
	JOptionPane.showMessageDialog(null, "" + num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5, "Lotery Ticket",JOptionPane.INFORMATION_MESSAGE);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
