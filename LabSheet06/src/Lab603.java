import java.util.*;
public class Lab603 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Please enter your name, seperated by a space.\n:");
		String fullname = input.nextLine();
		int result = fullname.indexOf(' ');
		String firstname = fullname.substring(0,result);
		System.out.print(abbreviatName(fullname).toUpperCase()+firstname);
		
	}
	public static String abbreviatName(String fullname) {
		String FullName="";
		for(int i = 0;i<fullname.length();i++) {
			if(fullname.charAt(i)==' ') {
				FullName = FullName+fullname.charAt(i+1)+".";
			}
		}	return FullName;
			
	}
}

