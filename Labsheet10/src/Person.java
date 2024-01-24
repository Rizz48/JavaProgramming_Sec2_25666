
public class Person {
	//
	private String firstName;
	private String lastName;
	
	//Default constructor
	Person(){
		firstName = "";
		lastName = "";
	}
	
	//Constructor with parameters
	Person(String first,String last){
		firstName = first;
		lastName = last;
		setName(first,last);
	}
	
	//Method to set firstName and lastName according to parameters
	public void setName(String first,String last) {
		firstName = first;
		lastName = last;
	}
	
	//Method to return firstName
	public String getFirstName() {
		return firstName;
	}
	
	//Method to return lastName
	public String getLastName() {
		return lastName;
	}
	
	//Method to output the first name last name
	public String toString() {
		return firstName+""+lastName;
	}
		

	
	
	

}
