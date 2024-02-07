import java.util.*;
import java.io.*;
public class Example1202 {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner (System.in);
		System.out.print("Input Section: ");
		int secInput = scan.nextInt();
		Header();
		showListStudent(secInput);
	}
	public static void showListStudent(int section)throws IOException {
		BufferedReader read = new BufferedReader(new FileReader ("d://txtFile//List107.txt"));
		String temp = "";
		while((temp = read.readLine())!= null) {
			String data [] = temp.split("\t");
			int sectionData = Integer.parseInt(data[3]);
			double midtermScore = Double.parseDouble(data[4]);
			double finalScore = Double.parseDouble(data[5]);
			if(sectionData == section) {
				System.out.println(data[0]+"\t"+data[2]+"\t"+midtermScore+"\t"+finalScore+"\t"+
				findResult(midtermScore,finalScore));
			}
		}
		read.close();
		
	}
	public static String findResult(double midScore,double finScore) {
		return midScore + finScore >= 40 ? "PASS" : "FAIL";
	}
	public static void Header() {
		System.out.println("==============================================================");
		System.out.println("\t\tList of Data for Section ");
		System.out.println("==============================================================");
	}

}
