import javax.swing.*;
import java.text.*;
public class Example4 {

	public static void main(String[] args) {;
		DecimalFormat frmid = new DecimalFormat("#,###.00");
		String name = JOptionPane.showInputDialog("Input Product Name:");
		int unit = Integer.parseInt(JOptionPane.showInputDialog("Input Product Unit:"));
		double price = Double.parseDouble(JOptionPane.showInputDialog("Input Price per unit:"));
		//Calculate
		double total = unit*price;
		double vat = total + (total*0.07);
		//Show DialogBox
		JOptionPane.showMessageDialog(null,"Total Price is "+ frmid.format(total) +" baht."
										 + "\nAdd VAT 7% is "+ frmid.format(vat) +" baht." );	
		

	}

}
