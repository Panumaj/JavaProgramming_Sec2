import java.util.Scanner;

public class Lab501 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Full Name: ");
		String name = scan.nextLine();
		int result = name.indexOf(' ');
		
		if (result == -1) {
			System.out.println("Incorrect Name");
		}
		else {
			String Firstname = name.toUpperCase().substring(0,result);
			String Lastname = name.toLowerCase().substring(result+1);
			System.out.println("First name: "+Firstname);
			System.out.println("Last name : "+Lastname);
			
		}
		
	}

}
