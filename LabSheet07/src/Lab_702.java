import java.util.Scanner;

public class Lab_702 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double [] score = new double[5];
		double average = 0;
		for(int i =0;i<score.length;i++) {
			System.out.print("Input score of student "+(i+1)+": ");
			score[i] = input.nextDouble();
			average+=score[i];
		}
		average = average / score.length;
		System.out.print("Average of "+score.length+" is "+String.format("%.2f",average));
		int i = 0;
		for(double _score:score) {
			if(_score>average) {
				System.out.println(" > Student "+(i+1)+" ("+_score+")");
			}
		}
	}

}
