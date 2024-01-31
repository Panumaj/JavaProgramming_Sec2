import java.time.*;
public class FictionBook implements Author,Book{
	private String author_name = " ";
	private String email;
	private String title;
	private int publicYear;
	
	FictionBook(String title,int publicYear){
		this.title = title;
		this.publicYear = publicYear;
	}
	public void setAuthorName(String name) {
		this.author_name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean checkFormatName() {
		int result = author_name.indexOf(' ');
		if(result == -1 )
			return false;
		else return true;
	}
	
	public String toString() {
		return getTitle()+" write by "+getLastName().charAt(0)+"."+getFirstName()+"("+this.email+")\nPublished for "+totalPublicYear()+
				" years ";
	}
	public String getLastName() {
		int result = author_name.indexOf(' ');
		return author_name.substring(result+1);
	}
	public String getFirstName() {
		int result = author_name.indexOf(' ');
		return author_name.substring(0,result);
	}
	public boolean checkEmail() {
		if(email.endsWith("@hotmail.com")||email.endsWith("@windowslive.com")) {
			return true;
		}
		else return false;
	}
	public String getTitle() {
		return this.title;
	}
	public int totalPublicYear() {
		return Year.now().getValue()-publicYear;
	}
}
