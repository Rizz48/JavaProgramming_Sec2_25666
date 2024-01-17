import java.util.*;

  public class BookDemo {
			
  static Scanner scan = new Scanner(System.in);
  public static void main(String[] args) {

	  System.out.print("Input book title:");
	  String BookTitle = scan.next();
	  
	  System.out.print("Input book price:");
	  float BookPrice = scan.nextFloat();
	  
	  System.out.print("Input publish year:");
	  int PublishYear = scan.nextInt();
	  
	  Book book = new Book();
	  book.setTitle(BookTitle);
	  book.setPrice(BookPrice);
	  book.setPublishyear(PublishYear);
	  
	  System.out.println(book.toString());   
  
  
	}

}
