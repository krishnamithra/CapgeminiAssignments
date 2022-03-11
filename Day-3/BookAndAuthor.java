package day3;


class Book {
   
   private String name;
   private Author author;
   private double price;
   private int qty;
 
   
   public Book(String name, Author author, double price, int qty) {
      this.name = name;
      this.author = author;
      this.price = price;
      this.qty = qty;
   }
 
   // Getters and Setters
   
   public String getName() {
      return name;
   }
   
   public Author getAuthor() {
      return author;  // return member author, which is an instance of the class Author
   }
   
   public double getPrice() {
      return price;
   }
   
   public void setPrice(double price) {
      this.price = price;
   }
   
   public int getQty() {
      return qty;
   }
   
   public void setQty(int qty) {
      this.qty = qty;
   }
 
   public String toString() {
      return "'" + name + "' by " + author;  // author.toString()
   }
}


class Author {
	
	   
	private String name;
	private String email;
	private char gender;   // 'm' or 'f'
	 
	   
	public Author(String name, String email, char gender) {
	   this.name = name;
	   this.email = email;
	   this.gender = gender;
	}
	 
	public String getName() {
	   return name;
	}
	   
	public char getGender() {
	   return gender;
	}
	   
	public String getEmail() {
	   return email;
	}
	   
	public void setEmail(String email) {
	   this.email = email;
	}
	 
	   
	public String toString() {
	   return name + " (" + gender + ") at " + email;
	}
}




public class BookAndAuthor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author a = new Author("Rohit","xyz@yahoo.com",'m');
		Book b = new Book("That Eerie Night",a,500.0,1);
		System.out.println(b);

	}

}
