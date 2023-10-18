import java.util.HashSet;
import java.util.Iterator;

class Book // extends Object <-- HashSet is comparing based on hashCode() of Object class equals() method
{
	int  bookNumber;
	String bookName;
	float bookPrice;

	public Book(int bookNumber) {
		super();
		this.bookNumber = bookNumber;
	}

	public Book(int bookNumber, String bookName, float bookPrice) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return this.hashCode()+" Book [bookNumber=" + bookNumber + ", bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
	}

	public int getBookNumber() {
		return bookNumber;
	}

	public String getBookName() {
		return bookName;
	}

	public float getBookPrice() {
		return bookPrice;
	}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + bookNumber;
        result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
        result = prime * result + Float.floatToIntBits(bookPrice);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        Book other = (Book) obj;
        if (bookNumber != other.bookNumber)
            return false;

        if (bookName == null) {
            if (other.bookName != null)
                return false;
        } else if (!bookName.equals(other.bookName))
            return false;

        if (Float.floatToIntBits(bookPrice) != Float.floatToIntBits(other.bookPrice))
            return false;

        return true;
    }

   

	
}
class Tiger { }

public class HashSetTest {
	public static void main(String[] args) {
		Book b1 = new Book(101,"Java8",1200.0f);
		Book b2 = new Book(102,"Java9",1300.0f);
		Book b3 = new Book(103,"Java11",1500.0f);
		Book b4 = b1;
        //Book b5 = null;
        //Book b6 = null;
        
        Book b7 = new Book(104,"Java8",1200.0f);
        Book b8 = new Book(104,"Java17",1200.0f);
        Book b9 = new Book(104,"Java20",1200.0f);


		System.out.println("Books are ready....");
		
		HashSet<Book> myBookShelf = new HashSet<Book>();
		System.out.println("Book shelf is ready....");
		
		System.out.println("Adding books to the bookShelf....");
		myBookShelf.add(b1);//referring equals+hashcode of Book
		myBookShelf.add(b2);//referring equals+hashcode of Book
		myBookShelf.add(b3);//referring equals+hashcode of Book
        myBookShelf.add(b4); //not added, cause its hashcode is same as of b1
     //   myBookShelf.add(b5);
     //   myBookShelf.add(b6);//another null is not accepted, only one is accepted
        myBookShelf.add(b7);
        myBookShelf.add(b8);
        myBookShelf.add(b9);
        

        


		
		System.out.println("Books are added to the Shelf..");
		Iterator<Book> bookIterator = myBookShelf.iterator();
	
		while(bookIterator.hasNext()) {
			Book theBook = bookIterator.next();
			System.out.println("The Book : "+theBook);	
		}
	}
}