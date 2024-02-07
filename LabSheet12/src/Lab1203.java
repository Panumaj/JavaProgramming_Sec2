import java.io.*;
public class Lab1203 {
	public static void main(String[] args)throws IOException {
		
		BufferedReader read = new BufferedReader(new FileReader ("d://txtFile//BookData.txt"));
		String temp = "";
		int i = 1;
		int countBook = 0;
		while((temp = read.readLine())!= null) {
			String data [] = temp.split("\t");
			System.out.println(i +". " +data[0] + " ("+data[1]+"), Rating "+ data[2]+" publish on "+data[5]);
			countBook++;
			i++;
		}
		System.out.println("=============================================================================");
		System.out.print("Total number of book : "+countBook);
		read.close();
	}
}
