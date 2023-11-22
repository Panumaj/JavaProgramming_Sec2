import javax.swing.*;
import java.text.*;
import java.util.*; //use library from random class
public class Withdrawal {

	public static void main(String[] args) {
		//using class random for random money 
		DecimalFormat frm = new DecimalFormat ("#,###");
		Random rdmoney = new Random();
		int balance = rdmoney.nextInt(9) * 100000;
		int money = Integer.parseInt(JOptionPane.showInputDialog("Your balance : "+frm.format(balance)+
				"\nInput money to withdraw: "));
		if (money > balance) {
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw more "
				+ "than balance","ERROR",JOptionPane.ERROR_MESSAGE);
				}
		else if (money > 20000) {
			JOptionPane.showMessageDialog(null, "Error:Cannot withdraw more than"
					+ " 20,000","ERROR",JOptionPane.ERROR_MESSAGE);
				}
		else if (money % 100<99 &&money %100>1  ) {
			JOptionPane.showMessageDialog(null, "Error Cannot withdraw "+(money%100)+""
					+ " baht.","ERROR",JOptionPane.ERROR_MESSAGE);
				}
		else {
				JOptionPane.showMessageDialog(null, "You withdraw "+frm.format(money)+" baht."
						+ "\n"+"1000 = "+money/1000+"\n500 = "+(money%1000)/500+"\n100 = "
								+ ((money%1000)%500)/100);
			 }	

	}

}
