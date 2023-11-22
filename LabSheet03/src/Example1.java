import javax.swing.*;
import java.text.*;
public class Example1 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		final int buff = 299;
		int manyCus = Integer.parseInt(JOptionPane.showInputDialog("How many customer per bill?:"));
		int totalprice = manyCus * buff;
		int member;
		do {
			member = JOptionPane.showConfirmDialog(null, "Total Price is "+frm.format(totalprice)
					+" baht."+"\nDo you have a member card?","Select an Option",JOptionPane.YES_NO_CANCEL_OPTION);
		}while(member == JOptionPane.CANCEL_OPTION);
		if(member == JOptionPane.YES_OPTION) {
			double pricemem = totalprice-(totalprice*10/100);
			JOptionPane.showMessageDialog(null, "Amount to be paid is "+frm.format(pricemem)+""
					+ " baht.");
		}
		else if (member == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Amount to be paid is "+frm.format(totalprice)+""
					+ " baht. ");
		}
		
	}
}

