
public class Test2 {
	   public static void main(String[] args) {
		      Author ree = new Author("Pavan Kalyan", "mvspkl.123@gmail.com", 'm');
		      System.out.println(ree);  
		      Book dummyBook = new Book("Java for dummies", ree, 9.99, 99); 
		      dummyBook.setPrice(8.88);
		      dummyBook.setqtyInStock(88);
		      System.out.println("Name of The Book is: " + dummyBook.getName());
		      System.out.println("Price of The Book is: " + dummyBook.getPrice());
		      System.out.println("Stock Available is: " + dummyBook.getqtyInStock());
		      System.out.println(dummyBook);       
		      System.out.println("Author of The Book is: " + dummyBook.getAuthor());  
		      System.out.println("Author's Name is: " + dummyBook.getAuthor().getName());
		      System.out.println("Author's Email is: " + dummyBook.getAuthor().getEmail());
		      System.out.println("Author's Gender is: " + dummyBook.getAuthor().getGender());
		   
		}

}
