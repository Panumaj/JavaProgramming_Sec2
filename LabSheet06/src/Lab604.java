import java.util.*;
public class Lab604 {
	static Scanner scan = new Scanner (System.in);
	static String studentID,strsubjectID;
	static int subjectID;
	public static void main(String[] args) {
		inputStudent();

	}
	public static void inputStudent() {
		do{
			System.out.print("Enter student id: ");
			studentID = scan.next();
			System.out.print("Enter subject id: ");
			subjectID = scan.nextInt();
			//convert subjectID from Integer to String (strsubjectID)
			strsubjectID = subjectID+"";
		}while(!isLength(studentID,strsubjectID));
		System.out.println();
		displayData(isITStudent(studentID),isITSubject(strsubjectID));
		
	}
	public static boolean isLength(String ID,String subID) {
		if (ID.length()==10 && subID.length()==7) {
			return true;
		}else {
			return false;
		}
		
	}
	public static boolean isITStudent(String ID) {
		if(ID.substring(0,3).equals("211")&& ID.substring(3,6).equals("311")) {
			return true;
		}else {
			return false;
		}
	}
	public static boolean isITSubject(String sub_id) {
		if(sub_id.substring(0,2).equals("21")&& sub_id.substring(4,5).equals("1")) {
			return true;
		}else {
			return false;
		}
	}
	public static void displayData(boolean SID,boolean subid) {
		if(SID) {
			System.out.print("Student ID: "+studentID+" 1st Year Student in IT");
		}else {
			System.out.print("Student ID: "+studentID+" is not 1st Year Student in IT");
		}
		if(subid) {
			System.out.print("Enroll in courses for Year 1 ");
		}else {
			System.out.print("not Enroll in courses for Year 1 ");
		}
	}
}
