import java.util.HashMap;
import java.util.Map;

public class BorrowRecords
{
	private Map<Book,LibraryMember> records;

	BorrowRecords()
	{
		this.records = new HashMap<>();
	}

	public boolean isAvailable(Book book)
	{
		return !records.containsKey(book);
	}

	public int getNumberOfBooksBorrowed(LibraryMember member)
	{
		int count=0;
		for (LibraryMember m : records.values())
		{
			if (m.equals(member))
			{
				count++;
			}
		}
		return count;
	}

	public void addBorrowingRecord(Book book, LibraryMember member) 
	{
        if (isAvailable(book)) 
        {
            records.put(book, member);
        }
    }

    public void returnBorrowedBook(Book book) 
    {
        records.remove(book);
    }

    @Override
    public String toString() 
    {
        return "BorrowRecords{" +
                "records=" + records +
                '}';
    }

}