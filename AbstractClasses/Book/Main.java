import java.util.ArrayList;
import java.util.List;

public class Main
{
	public static void main(String[] args)
	{
	Book[] books = new Book[6];
books[0] = new TextBook("Data Structures: A Pseudocode Approach with C", new Author("Gilberg", "Richard"), 1998, "Computer Science");
books[0].addAdditionalAuthor(new Author("Forouzan","Behrouz"));
books[1] = new FilipinianaMaterial("Baybayin: Ang Sinaunang Sulat", new Author("Giro", "Julian"), 1911, PhilippineIslandGroup.Visayas);
books[2] = new Novel("The Long Earth: The Long Cosmos", new Author("Pratchett", "Terry"), 2016, Genre.ScienceFiction);
books[3] = new FilipinianaMaterial("Kadang-kadang", new Author("Lopez", "Carlos"), 1985, PhilippineIslandGroup.Mindanao);
books[4] = new TextBook("Understanding The Self", new Author("Cellona", "Michelle"), 2018, "Psychology");
books[5] = new TextBook("Physics of Atomic Nuclei", new Author("Zelevinsky", "Vladimir"), 2017, "Physics");
books[5].addAdditionalAuthor(new Author("Volya","Alexander"));

BorrowRecords logs = new BorrowRecords();
LibraryMember[] members = new LibraryMember[4];
members[0] = new LibraryMember("Rene");
members[1] = new LibraryMember("Carl");
members[2] = new LibraryMember("Nina");
members[3] = new LibraryMember("Judy");


System.out.println(members[0].borrow(books[0], logs));
System.out.println(members[0].borrow(books[1], logs));
System.out.println(members[0].borrow(books[2], logs));
System.out.println(members[0].borrow(books[5], logs));

System.out.println();
System.out.println(members[1].borrow(books[0], logs));
System.out.println(members[1].borrow(books[2], logs));
System.out.println(members[1].borrow(books[4], logs));
System.out.println(members[1].borrow(books[5], logs));
logs.returnBorrowedBook(books[2]);
logs.returnBorrowedBook(books[5]);
System.out.println(members[1].borrow(books[2], logs));
System.out.println(members[1].borrow(books[5], logs));

System.out.println();
System.out.println(logs);

logs.returnBorrowedBook(books[0]);
logs.returnBorrowedBook(books[2]);
System.out.println(members[2].borrow(books[0], logs));
System.out.println(members[3].borrow(books[2], logs));

System.out.println();
System.out.println(logs);

logs.returnBorrowedBook(books[0]);
logs.returnBorrowedBook(books[2]);
logs.returnBorrowedBook(books[4]);
System.out.println(members[1].borrow(books[0], logs));
System.out.println(members[1].borrow(books[2], logs));
System.out.println(members[1].borrow(books[4], logs));

System.out.println();
System.out.println(logs);
	}

}