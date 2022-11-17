import java.util.Scanner;

public class Lab203 {

	public static void main(String[] args) {
		int i =0;
		
			  
			
		Scanner scan = new Scanner(System.in);
		System.out.println("Input two integers(a b) : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int sum = num1 + num2;
		System.out.println("Sum of two integers:"+sum);
		while (sum != 0) {
			sum/=10;
			i++;
		}
		System.out.println("Digit number of sum of said two integers:\n"+i);

	}

}
