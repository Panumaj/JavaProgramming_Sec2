import java.util.*;
public class FictionDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Input Title Book ");
		String bookf = scan.nextLine();
		System.out.print("Input Year ");
		int year = scan.nextInt();
		
		FictionBook book = new FictionBook(bookf,year);
		scan.nextLine();
		System.out.print("Input Full Name ");
		String fullname = scan.nextLine();
		
		while(!book.checkFormatName()) {
			System.out.print("Input Full Name ");
			fullname = scan.nextLine();
			book.setAuthorName(fullname);
		}
		System.out.print("Input Email ");
		String mail = scan.nextLine();
		scan.nextLine();
		book.setAuthorName(fullname);
		book.setEmail(mail);
		while(!book.checkEmail()) {
			System.out.print("Input Email ");
			mail = scan.next();
			book.setEmail(mail);
		}
		
		System.out.print(book);
		
	}

}
