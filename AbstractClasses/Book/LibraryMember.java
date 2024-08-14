public class LibraryMember
{
	private String name;

	LibraryMember(String name)
	{
		this.name=name;
	}

	public String getName()
	{
		return name;
	}

	public boolean borrow(Book book, BorrowRecords borrowRecords)
	{
		if (book instanceof Borrowable)
		{
			return ((Borrowable)book).borrow(this,borrowRecords);
		}
		return false;
	}
}