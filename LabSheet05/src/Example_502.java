import javax.swing.JOptionPane;

public class Example_502 {

	public static void main(String[] args) {
		String mail = JOptionPane.showInputDialog("Input your e-mail: ");
		//2.Check email starts with @ , " " 
		while(mail.startsWith("@")||mail.startsWith(" ")){
			mail = JOptionPane.showInputDialog("Input your e-mail, again: ");
		}
		//3.Check mail and with hotmail.com
		mail = mail.toLowerCase();
		if(mail.endsWith("hotmail.com")||mail.endsWith("gmail.com")) {
			JOptionPane.showMessageDialog(null, "Your email is " +mail);
		}
		else {
			JOptionPane.showMessageDialog(null,"Your e-mail is not hotmail or gmail dot com");
		}
		

	}

}
