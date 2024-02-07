import java.util.*;
import java.io.*;
public class Example1201 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner (new File("d://txtFile//MemberLogin.txt"));
		while(scan.hasNext()) 
		{
			String fname = scan.next();
			String lname = scan.next();
			scan.next();
			String mail = scan.next().toUpperCase();
			System.out.println(fname+" ("+mail+")");
		}
		scan.close();
	}

}
