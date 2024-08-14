import java.util.ArrayList;
import java.util.List;

public abstract class Book
{
	private String title;
	private int publicationYear;
	private List<Author> authors;

	Book(String title,Author mainAuthor,int publicationYear)
	{
		this.title = title;
		this.publicationYear = publicationYear;
		this.authors = new ArrayList<>();
		this.authors.add(mainAuthor);
	}

	Book(Book book)
	{
		this.title = book.title;
		this.publicationYear = book.publicationYear;
		this.authors = new ArrayList<>(book.authors);
	}

	public String getTitle() 
	{
        return title;
    }

    public int getPublicationYear() 
    {
        return publicationYear;
    }

    public List<Author> getAuthors() 
    {
        return new ArrayList<>(authors);
    }

    public void addAdditionalAuthor(Author author) 
    {
        this.authors.add(author);
    }

	@Override
    public String toString()
    {
	    String text = this.title + "(" + this.publicationYear + ") by ";
	    for(Author a : this.authors)
	    {
		    text += a;
		    if(!a.equals(this.authors.get(this.authors.size()-1)))
			text += ", ";
	    }
	    return text + " ";
    }

}