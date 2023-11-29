import java.util.*;
public class Example1 {

	public static void main(String[] args) {
		//Create object for input data from console
		Scanner scan = new Scanner(System.in);
		int currentNum,PreviousNum;
		System.out.print("Input Number : ");
		PreviousNum = scan.nextInt();
		
		while(true) {
			System.out.print("Input Number : ");
			currentNum = scan.nextInt();
			
			if(currentNum < PreviousNum) {
				System.out.println("BYE BYE");
				break;
			}
			PreviousNum = currentNum;
		}
		
		
		
		
	}

}
