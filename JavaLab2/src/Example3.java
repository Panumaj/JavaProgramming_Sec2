import java.util.*;
import java.text.*;
public class Example3 {

	public static void main(String[] args) {
		DecimalFormat frmId = new DecimalFormat("#,###.00");
		DecimalFormat frmID = new DecimalFormat("#,###.00");
		Scanner name = new Scanner (System.in);
		System.out.print("Input product name   : ");
		String product = name.nextLine();
		System.out.print("Input product unit   : ");
		int unit = name.nextInt();
		System.out.print("Input price per unit : ");
		double price = name.nextDouble();
		System.out.println("");
		double total = price * unit;
		double vat = total +(total*0.07);
		System.out.println("Total Price is "+frmId.format(total)+" Baht.");
		System.out.println("Add VAT 7%  is "+frmID.format(vat)+  " Baht.");
		
		

	}

}
