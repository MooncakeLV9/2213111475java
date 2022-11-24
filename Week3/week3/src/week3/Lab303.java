package week3;
import java.util.Random;
import javax.swing.*;
import java.text.*;

public class Lab303 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###");
		Random rand = new Random();
		int balance = rand.nextInt(9) * 100000;
		
		int moneydaw = Integer.parseInt(JOptionPane.showInputDialog("Your balance:"+frm.format(balance)+"\nInput money to withdraw:"));
		if (moneydaw > balance) {
			JOptionPane.showMessageDialog(null, 
					"Error:Cannot withdraw more than balance",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		else if (moneydaw > 20000) {
			JOptionPane.showMessageDialog(null, 
				"Error:Cannot withdraw more than 20,000",
				"ERROR",
				JOptionPane.ERROR_MESSAGE); 
		} 
		else if (moneydaw % 100 != 0) {
			
			JOptionPane.showMessageDialog(null, 
				"Error:Cannot withdraw "+moneydaw % 100+" baht.",
				"ERROR",
				JOptionPane.ERROR_MESSAGE); 
		}
		else  {
			int thousand = moneydaw/1000;
			int mthousand = moneydaw%1000;
			int fhundred = mthousand/500;
			int mfhundred = mthousand%500;
			int hundred = mfhundred/100;
			int mhundred = hundred%100;
			JOptionPane.showMessageDialog(null, "You withdraw "+moneydaw+" baht."+
		"\n1,000 = "+thousand+
		"\n500 = "+fhundred+
		"\n100 = "+mhundred);
			
		}

		

	}

}

