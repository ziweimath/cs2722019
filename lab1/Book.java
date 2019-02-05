import java.util.Arrays;

public class Book {
	private String BookTitle;
	private int AuthorNumber;
	private String[] BookAuthors = new String[3];
	private String ISBN;


/**
* #1 Constructor 1.  The no-argument constructor
*
**/

public Book() {
	BookTitle = null;
	AuthorNumber = 0;
	ISBN = null;
	
}

/**
* #2 Constructor 2.  One argument constructor
*
**/
public Book(String _BookTitle) {
	BookTitle = _BookTitle;
	AuthorNumber = 0;
	ISBN = null;
}

/**
* #3 Constructor 3.  copy constructor
*
**/
public Book(Object obj) {
	if (obj != null && obj instanceof Book) {
		
		Book obj_book = (Book)obj;
		ISBN = obj_book.ISBN;
		BookTitle = obj_book.BookTitle;
		AuthorNumber = obj_book.AuthorNumber;
		for (int i=0; i<obj_book.getAuthorNumber(); i ++) {
			BookAuthors[i] = obj_book.BookAuthors[i];
		}
	}
	
	
}

/**
* #4 Methods 1: getTitle
*
**/
public String getTitle() {
	return BookTitle;
}

/**
* #5 Methods 2: getAuthorNumber
*
**/
public int getAuthorNumber() {
	return AuthorNumber;
}

/**
* #6 Methods 3: getISBN
*
**/
public String getISBN() {
	return ISBN;
}

/**
* #7 Methods 4: setBookTitle
*
**/
public void setTitle (String _BookTitle) {
	BookTitle = _BookTitle;
}

/**
* #8 Methods 5: setISBN
*
**/
public void setISBN (String _ISBN) {
	ISBN = _ISBN;
}

/**
* #9 Methods 6: addAuthor
*
**/
public boolean addAuthor(String _BookAuthors) {
	if (AuthorNumber<3) {
		BookAuthors[AuthorNumber] = _BookAuthors;
		AuthorNumber ++;
		return true;
	}
	return false;
}

/**
* #10 Methods 6: equals methods
*
**/
public boolean equals(Object obj) {
	if (obj != null && obj instanceof Book) {
		Book candidate = (Book) obj;
		return (candidate.ISBN==ISBN);
	}
	else 
		return false;
	
}

/**
* #11 Methods 7: getAllAuthors
*
**/
public static String[] getAllAuthors(Book b1, Book b2) {
	if (b1 == null|| b2 == null)
	{
		return null; 
	}
	String[] array = new String[b1.getAuthorNumber() + b2.getAuthorNumber()];
	for (int i=0; i<b1.getAuthorNumber(); i++) {
		array[i] = b1.BookAuthors[i];
	}
	int already = b1.getAuthorNumber();
	for (int i=0; i<b2.getAuthorNumber(); i++) {
		boolean add = true;
		for (int j=0; j<b1.getAuthorNumber(); j++) {
			if (b1.BookAuthors[j] == b2.BookAuthors[i]) {
				add = false;
				break;
			}
		}
		
		if (add == true)
		array[i+already] = b2.BookAuthors[i];
	}
	return array;
}
	

/**
* #12 Methods 8: 
*
**/
public String toString() {
	String names = "";
	for (int i=0; i<this.getAuthorNumber(); i++) {
		names = names + " " + this.BookAuthors[i];
	}
	return "The title is "+ BookTitle + "\nISNB is "+ ISBN+ "\nThe number of authors is "+ AuthorNumber + " \nNames: " + names;
}




	public static void main(String[] args) {
		// Test the no-argument constructor
			Book book1 = new Book();
			System.out.println("Test the no-argument constructor. \nbook1 is " + book1 );
		// Test the one argument constructor
			Book book2 = new Book("My First ABC Book!");
			System.out.println("Test the one argument constructor. \nbook2 \n" + book2 );
		// Test the copy constructor
			
			Book book3 = new Book(book2);
			Book book4 = new Book(book1);
			System.out.println("Test the copy constructor. \nbook3 \n" + book3 +"\n(The copy of book2.)");
			System.out.println("Test the copy constructor. \nbook4 \n" + book4 +"\n(The copy of book1.)");
		// 	Test getTitle method
			
		    System.out.println("The title of book1 is " + book1.getTitle() );
			System.out.println("The title of book2 is " + book2.getTitle() );
			System.out.println("The title of book3 (the copy of book2) is " + book3.getTitle() );
			System.out.println("The title of book4 (the copy of book1) is " + book4.getTitle() );
			
		// Test getAuthorNumber method
			System.out.println("Test getAuthorNumber method." );
			System.out.println("The author number of book1 is " + book1.getAuthorNumber() );
			System.out.println("The author number of book2 is " + book2.getAuthorNumber() );
			System.out.println("The author number of book3 (the copy of book2) is " + book3.getAuthorNumber() );
			System.out.println("The author number of book4 (the copy of book1) is " + book4.getAuthorNumber() );
		
		// Test getISBN method
			System.out.println("Test getISBN method." );
			System.out.println("The ISBN of book1 is " + book1.getISBN() );
			System.out.println("The ISBN of book2 is " + book2.getISBN() );
			System.out.println("The ISBN of book3 (the copy of book2) is " + book3.getISBN() );
			System.out.println("The ISBN of book4 (the copy of book1) is " + book4.getISBN() );
		
		// Test setTitle method
			System.out.println("Test setTitle method." );
			book1.setISBN("0123456789");
			book2.setISBN("9999999999");
			System.out.println("book1\n" + book1 );
			System.out.println("book2\n" + book2 );
			System.out.println("book3\n" + book3 );
			System.out.println("book4\n" + book4 );
		// Test copy constructor again which shows the copy constructor will copy the latest object!!
			System.out.println("Test copy constructor again." );
			Book book5 = new Book(book1);
			Book book6 = new Book(book2);
			System.out.println("book5\n" + book5 );
			System.out.println("book6\n" + book6 );
			
		// Test addAuthor method
			System.out.println("Test addAuthor method." );
			book1.addAuthor("John");
			book2.addAuthor("Simon");
			System.out.println("book1\n" + book1 );
			System.out.println("book2\n" + book2 );
			
			book1.addAuthor("Peter");
			book2.addAuthor("John");
			System.out.println("book1\n" + book1 );
			System.out.println("book2\n" + book2 );
			
			book1.addAuthor("Paul");
			book2.addAuthor("Micheal");
			System.out.println("book1\n" + book1 );
			System.out.println("book2\n" + book2 );
			
		// After add three authors, the addAuthor method does not work any more!	
			System.out.println("Test addAuthor method when there are three authors already." );
			book1.addAuthor("Tony");
			book2.addAuthor("Joe");
			System.out.println("book1\n" + book1 );
			System.out.println("book2\n" + book2 );
		// Test equal method
			System.out.println("Test equal method." );
			System.out.println("Do book1 and book2 have the same ISBN? \n" + book1.equals(book2) );
			System.out.println("Do book1 and book3 have the same ISBN? \n" + book1.equals(book3) );
			System.out.println("Do book1 and book4 have the same ISBN? \n" + book1.equals(book4) );
			System.out.println("Do book1 and book5 have the same ISBN? \n" + book1.equals(book5) );
			System.out.println("Do book1 and book6 have the same ISBN? \n" + book1.equals(book6) );
			
		// Test getAllAuthors method
			System.out.println("Test getAllAuthors method." );
			System.out.println(book1);
			System.out.println(book2);
			System.out.println("Get all authors of book1 and book2\n" + Arrays.toString(Book.getAllAuthors(book1,book2)) );
		// I can not understand why there is an null in the 4th place in the authors list??
	}

}
