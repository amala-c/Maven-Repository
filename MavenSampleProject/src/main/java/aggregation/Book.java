package aggregation;

public class Book  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author ob=new Author("AuthoName");
		Book obj =new Book("BookName", 20, ob);
		obj.display();

	}
	
	
	String book;
	int date;
	Author a;
	public Book(String book, int date, Author a)
	{
		this.book=book;
		this.date=date;
		this.a=a;
	}
	 public void display()
	 {
		 System.out.println("Name of Book is" +book);
		 System.out.println("Date of publishing " +date);
	 }

}
