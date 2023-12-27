import java.util.*;
public class Lab_701 {

	public static void main(String[] args) {
		int [] num = new int[7];
		int odd= 0;
		Scanner input = new Scanner (System.in);
		
		for (int i = 0;i<num.length;i++) {
			System.out.print("Input number "+(i+1)+" : ");
			num[i] = input.nextInt();
			
			if(num[i] %2!=0) {
				odd++;
				
			}
			
		}
		System.out.println("There are "+odd+" of odd number.");
		System.out.print("List of odd number : ");
		
		for(int _number : num) {
			if(_number %2==1) 
			{
				System.out.print(_number+" ");
				
			}
			
		}
		
		
	}

}
