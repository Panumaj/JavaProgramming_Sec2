import java.text.*; //Import decimalFormat
public class Example2 {

	public static void main(String[] args) {
		DecimalFormat frmId = new DecimalFormat("#,###.00");
		DecimalFormat frmIde = new DecimalFormat("#,###.00");
		final int BUFFET = 299;
		int customer = 5;
		float total = BUFFET * customer;
		double service = total*0.03;
		System.out.println("Buffet of 5 customers is "+frmId.format(total));
		System.out.println("Add Service Charge 3% is "+frmIde.format(total+service));

	}

}
