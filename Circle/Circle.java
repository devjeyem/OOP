public class Circle
{
	private double radius;

	public Circle()
	{
		radius = 1.0;
	}

	public Circle(double radius)
	{
		this.radius = radius;
	}

	public double getRadius()
	{
		return radius;
	}

	public void setRadius(double radius)
	{
		this.radius = radius;
	}

	public double getArea()
	{
		double area = radius*radius*Math.PI;
		return area;
	}

	public double getCircumference()
	{
		return 2*Math.PI*radius;
	}

	public String toString()
	{
		return "Circle[radius=" + radius + "]";
	}
}