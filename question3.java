class Book{
	String isbn,title;
	int price;
	public Book(String isbn,String title,int price)
	{
		this.isbn=isbn;
		this.title=title;
		this.price=price;
	}
	public void displaydetails()
	{
		System.out.println("ISBN:"+isbn);
		System.out.println("TITLE:"+title);
		System.out.println("PRICE:"+price);
	}
}

class magazine extends Book
{
	String type;
	public magazine(String isbn,String title,int price,String type)
	{
		super(isbn,title,price);
		this.type=type;
	}
	public void displaydetails()
	{
		super.displaydetails();
		System.out.println("TYPE:"+type);
	}
}

class novel extends Book
{
	String author;
	public novel(String isbn, String title, int price,String author) {
		super(isbn, title, price);
		this.author=author;
	}
	public void displaydetails()
	{
		super.displaydetails();
		System.out.println("Author:"+author);
	}
	
}

public class question3 {
	public static void main(String args[]) {
		Book b1=new magazine("BA101", "ABC", 999,"Gadgets");
		Book b2=new novel("BA102","XYZ",599,"Chetan Bhagat");
		
		b1.displaydetails();
		System.out.println();
		b2.displaydetails();
		
	}
}
