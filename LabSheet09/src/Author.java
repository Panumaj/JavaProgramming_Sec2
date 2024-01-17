
public class Author {
	public static final String DEFAULT_NAME = " ";
	public static final String DEFAULT_EMAIL = " ";
	public static final char DEFAULT_GENDER = ' ';
	private String name;
	private String email;
	private char gender;
	public Author(String name,String email,char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public Author(String name,String email) {
		this.name = name;
		this.email = email;
		this.gender = DEFAULT_GENDER;
	}
	public Author() {
		this.name = DEFAULT_NAME;
		this.email = DEFAULT_EMAIL;
		this.gender = DEFAULT_GENDER;
	}
	public String getName() {
		return this.name;
	}
	public String getEmail() {
		return this.email;
	}
	public String getGenderName() {
		if (gender == 'M') {
			return "Male";
		}
		else if (gender == 'F') {
			return "Female";
		}else {return "Null";}
		
	}
	public String toString() {
		return "Author name: "+name+"("+email+";"+getGenderName()+")";
	}
}
