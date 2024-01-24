
public class Date {
	 //declare 3 private attributes	
	 private int dMonth;
	 private int dDay;
	 private int dYear;
	 
	 //Default constructor
	 //Postcondition: dMonth=1, dDay=1, dYear=1900
	 Date(){
		 dMonth=1;
		 dDay=1;
		 dYear=1900;
	 }
	 
	 //Constructor to set the date
	 //
	 Date(int month,int day,int year){
		 dMonth = month;
		 dDay = day;
		 dYear = year;
	 }
	 
	 public void setDate(int month,int day,int year) {
		 dMonth = month;
		 dDay = day;
		 dYear = year;
	 }
	 
	 public int getMonth() {
		 return dMonth;
	 }
	 
	 public int getDay() {
		 return dDay;
	 }
	 
	 public int getYear() {
		 return dYear;
	 }
	 
	 public String toString() {
			return dMonth+"-"+dDay+"-"+dYear;
		}
	 
	 
	

}
