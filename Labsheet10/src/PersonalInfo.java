
public class PersonalInfo {
	private Person name;//object name reference class Person
	private Date bDay;//object name reference class Date
	//declare a private attribute
	private int personID;
	
	//Default constructor
	//Postcondition: fristName="", lastNAme=""
	//dMonth=1,dDay=1, and dYear=1900
	//personID=0
	PersonalInfo(){
		name = new Person();//fristName="", lastNAme=""
		bDay = new Date();//dMonth=1,dDay=1, and dYear=1900
		personID = 0;
	}
	
	//Constructor with parameter
	PersonalInfo(String first, String last, int month, int day, int year,int ID){
		name = new Person(first,last);
		bDay = new Date(month,day,year);
		personID = ID;		
	}
	
	public void setPersonalInfo(String first, String last, int month, int day, int year,int ID) {
		name.setName(first, last);
		bDay.setDate(month, day, year);
		personID = ID;
	}
	
	public String toString() {
		return "Name: "+name.toString()+"\n"+"Date of birth: "+bDay.toString()+"\n"+"Personal ID: "+personID;
	}
	

}
