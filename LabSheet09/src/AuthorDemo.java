import java.util.*;
public class AuthorDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Input author name : ");
		String name = scan.nextLine();
		System.out.print("Input author e-mail : ");
		String email = scan.nextLine();
		System.out.print("Input author gender : ");
		char gender = scan.next().charAt(0);
		Author A1 = new Author(name,email,gender);
		
		System.out.print(A1);
	}

}
