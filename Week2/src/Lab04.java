import javax.swing.JOptionPane;
public class Lab04 {

	static final double TAX_RATE = .0625;
	public static void main(String[] args) {
		
    String cdID = JOptionPane.showInputDialog("this program calculates the total cost of a CD order"+
    "\nPlease enter the ID of the CD ");
    String cdTitle = JOptionPane.showInputDialog("Please enter the title of the CD");
    String strPrice = JOptionPane.showInputDialog("Please enter the price of the CD in U.S.dollars");
    double cdPrice = Double.parseDouble(strPrice);
    String strQuantity= JOptionPane.showInputDialog("Please enter the quantity to be purchased");
    int cdQuantity = Integer.parseInt(strQuantity);
    double cdSubtotal = cdPrice * cdQuantity;
    double cdtotal = cdSubtotal * (1+TAX_RATE);
    double TAX =TAX_RATE*100;
    
    JOptionPane.showInputDialog(null,"Summary of the transaction:"+"\n\n+CD ID: "+cdID+"\nCD Title: "+cdTitle+
    		"\nCD Unit Price: "+"$"+cdPrice+"\nCD Quantity: "+cdQuantity+"\n\nSubtotal: $"+cdSubtotal+
    		"\nTax rate: "+TAX+"%"+"\nTotal: "+"$"+cdtotal+"\n\nEnd of Program");
	}

}
