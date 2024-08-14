public class Circle extends Shape
{
	protected double radius;

	Circle()
	{
		super();
		radius = 1.0;
	}

	Circle(double radius)
	{
		super();
		this.radius = radius;
	}

	Circle(double radius,String color,boolean filled)
	{
		super(color,filled);
		this.radius = radius;
	}

	public double getRadius()
	{
		return radius;
	}

	public void setRadius(double radius)
	{
		this.radius=radius;
	}

	@Override
	public double getArea()
	{
		return radius*radius*Math.PI;
	}

	@Override
	public double getPerimeter()
	{
		return 0.0;
	}

	@Override
	public String toString()
	{
		return "Circle[Shape[color="+ this.color+",filled=" + this.filled+ "],radius="+radius+"]"; 
	}
}