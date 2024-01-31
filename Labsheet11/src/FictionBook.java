import java.time.Year;

public class FictionBook {
	
	private String author_name;
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
	
	public String getLastName() {
		return this.author_name.substring(this.author_name.indexOf(" ")+1).toUpperCase();
	}
	
	public String getFirstName() {
		return this.author_name.substring(0,this.author_name.indexOf(" ")).toUpperCase();
	}
	
    public void setEmail(String email) {
		this.email = email;
	}
    
    public boolean checkFormatname() {
    	return this.author_name.indexOf(" ") >= 0;				
				
	}
    
    public boolean checkEmail() {
    	if(email.endsWith("@hotmail.com")|| (email.endsWith("@windowslive.com"))) {
    		return true;
    	}else {
    		return false;
    	}
   	}
    
    public String getTitle() {
		return this.title;
	}
	
    public int totalPublicYear() {
    	return Year.now().getValue() - this.publicYear;
	}
    
    public String toString() {
    	return getTitle()+" write by "+getLastName().substring(0,1)+"."+getFirstName()
		+"("+this.email+")\nPubliched for "+totalPublicYear()+" years.";
	}
	

}
