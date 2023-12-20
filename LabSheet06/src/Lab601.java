import javax.swing.*;
public class Lab601 {

	public static void main(String[] args) {
		inputEmail();
	}
	public static void inputEmail() {
		String input = JOptionPane.showInputDialog("Input your e-mail:").toLowerCase();
		boolean checkemail = checkEmail(input);
		displayEmail(checkemail,input);
	}
	public static boolean checkEmail(String mail) {
		if(mail.endsWith("hotmail.com")|| mail.endsWith("gmail.com")) 
			 {
			return true;		
			 }
		else {
			return false;
			 }
	}
	public static void displayEmail(boolean check,String input) {
		if(check == true) {
			JOptionPane.showMessageDialog(null, "Your e-mail is "+input);
		}
		else {
			JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail");
		}
		
		JOptionPane.showMessageDialog(null, "Your e-mail is "+input);
	}
}
	
