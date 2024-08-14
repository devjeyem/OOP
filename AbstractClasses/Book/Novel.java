public class Novel extends Book implements Borrowable {
    private Genre genre;
    private int numTimesBorrowed;

    // Constructor
    public Novel(String title, Author mainAuthor, int publicationYear,Genre genre) 
    {
        super(title, mainAuthor, publicationYear);
        this.genre = genre;
        this.numTimesBorrowed = 0;
    }

    // Copy Constructor
    public Novel(Novel novel) {
        super(novel.getTitle(), novel.getAuthors().get(0), novel.getPublicationYear());
        this.genre = novel.genre;
        this.numTimesBorrowed = novel.numTimesBorrowed;
    }

    // Accessors
    public Genre getGenre() {
        return genre;
    }

    public int getNumTimesBorrowed() {
        return numTimesBorrowed;
    }

    @Override
    public boolean borrow(LibraryMember member, BorrowRecords borrowRecords) {
        if (borrowRecords.isAvailable(this)) {
            borrowRecords.addBorrowingRecord(this, member);
            numTimesBorrowed++;
            return true;
        }
        return false;
    }

    // Override toString metho

    @Override
    public String toString()
    {
        return "[N:" + this.numTimesBorrowed + "] " + super.toString();
    }
}
