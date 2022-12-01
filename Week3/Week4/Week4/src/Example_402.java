import javax.swing.JOptionPane;

public class Example_402 {

	public static void main(String[] args) {
		String inputEmail = JOptionPane.showInputDialog("Input your e-mail:");
		while(inputEmail.startsWith("@")||inputEmail.contains(" ")) {
			inputEmail = JOptionPane.showInputDialog("Input your e-mail, again :");
		}
		inputEmail = inputEmail.toLowerCase();
		/*if(inputEmail.endsWith("@gmail.com")||inputEmail.contains("@hotmail.com")) {
			JOptionPane.showMessageDialog(null,"Your e-mail is "+inputEmail);
		}else {
			JOptionPane.showMessageDialog(null,"Your e-mail is not hotmail or gmail dot com ");
		}*/
		boolean checkEmail = inputEmail.endsWith("@gmail.com")||inputEmail.contains("@hotmail.com");
		JOptionPane.showMessageDialog(null,
				(checkEmail)
				?"Your email is "+inputEmail
						:"Your email is not hotmail or gmail dot com ");

	}

}
