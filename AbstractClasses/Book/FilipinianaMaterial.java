public class FilipinianaMaterial extends Book
{
	private PhilippineIslandGroup islandGroupOrigin;

	FilipinianaMaterial(String title, Author mainAuthor, int publicationYear, PhilippineIslandGroup islandGroupOrigin)
	{
		super(title,mainAuthor,publicationYear);
		this.islandGroupOrigin = islandGroupOrigin;
	}

	public PhilippineIslandGroup getIslandGroupOrigin()
	{
		return islandGroupOrigin;
	}

	@Override
    public String toString() 
    {
        return "FilipinianaMaterial{" +
                "islandGroupOrigin=" + islandGroupOrigin +
                "} " + super.toString();
    }
}