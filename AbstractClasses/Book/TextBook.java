public class TextBook extends Book implements Borrowable
{
	private String subject;

	TextBook(String title, Author mainAuthor,int publicationYear,String subject)
	{
		super(title,mainAuthor,publicationYear);
		this.subject = subject;
	}

	TextBook(TextBook textBook)
	{
		super(textBook.getTitle(), textBook.getAuthors().get(0), textBook.getPublicationYear());
        this.subject = textBook.subject;
	}

    public String getSubject() 
    {
        return subject;
    }

    @Override
    public boolean borrow(LibraryMember member, BorrowRecords borrowRecords) 
    {
        if (borrowRecords.isAvailable(this)) 
        {
            borrowRecords.addBorrowingRecord(this, member);
            return true;
        }
        return false;
    }

    @Override
    public String toString() 
    {
        return super.toString() + " Subject: " + subject;
    }
}