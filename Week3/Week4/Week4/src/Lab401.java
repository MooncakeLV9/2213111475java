import java.util.*;
public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full Name: ");
		String foolname = scan.nextLine();
		int spec = foolname.indexOf(' ');
		
		if (spec ==-1) {
			System.out.print("Incorrect Name");
		}
		else {
			System.out.println("First Name: "+
		foolname.substring(0,spec).toUpperCase());
			System.out.println("Last Name: "+ 
		foolname.substring(spec+1).toLowerCase());
		}

	}

}
