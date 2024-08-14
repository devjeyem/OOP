public class Cylinder extends Circle
{
	private double height;

	Cylinder()
	{
		super();
		height = 1.0;
	}

	Cylinder(double height)
	{
		super();
		this.height = height;
	}

	Cylinder(double radius, double height)
	{
		super(radius);
		this.height = height;
	}

	public double getHeight()
	{
		return height;
	}

	public double getVolume()
	{
		return getArea()*height;
	}

	@Override
	public String toString() 
	{      // in Cylinder class
   		return "Cylinder: subclass of " + super.toString()  // use Circle's toString()
          + " height=" + height;
	}
}