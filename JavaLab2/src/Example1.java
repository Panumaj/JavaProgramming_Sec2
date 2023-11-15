
public class Example1 {

	public static void main(String[] args) {
		String ISBN = "IB2-6325-85-4-1";
		String title = " Basic Java Programming";
		int unit = 5;
		double price = 225.75;
		System.out.println("Book ISBN  : " +ISBN);
		System.out.println("Book Title :"+title);
		System.out.println("Book Unit  : "+unit+" Books.");
		System.out.println("Book Price :"+price +" Baht.");
		System.out.println("-----------------------------");
		//Calculate
		double total = unit*price;
		double vatt = total *0.07;
		System.out.println("Total Price is "+total);
		System.out.println("Add VAT 7%  is "+(total + vatt));

	}

}
