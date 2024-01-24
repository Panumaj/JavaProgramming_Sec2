
public class PersonalInfo {
	private Person name;//object name references class Person
	private Date bDay; //object bDay references class Date
	//declare 1 private attribute
	private int personID;
	
	//Default constructor
	//postCondition firstName="",lastName=""
	//dMonth = 1 , dDay = 1 and dYear = 1990
	//personID = 0
	PersonalInfo(){
		name = new Person();
		bDay = new Date();
		personID = 0;
	}
	PersonalInfo (String first,String last,int month,int day,int year,int ID){
		name = new Person(first,last);
		bDay = new Date(month,day,year);
		personID = ID;
	}
	//method to set the personal information
	//call set method from class Person and class Date
	public void setPersonalInfo (String first,String last,int month,int day,int year,int ID) {
		name.setName(first, last);
		bDay.setDate(month, day, year);
		personID = ID;
	}
	public String toString() {
		return "Name: "+name.toString()+"\n"+"Date of birth: "+bDay.toString()+"\nPersonal ID: "+personID;
	}
}
