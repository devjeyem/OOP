public class Rectangle extends Shape
{
	protected double width;
	protected double length;

	Rectangle()
	{
		super();
		width = 1.0;
		length = 1.0;
	}

	Rectangle(double width,double length)
	{
		super();
		this.width = width;
		this.length =length;
	}

	Rectangle(double width,double length,String color,boolean filled)
	{
		super(color,filled);
		this.width = width;
		this.length = length;
	}

	public double getWidth()
	{
		return width;
	}

	public void setWidth(double width)
	{
		this.width = width;
	}

	public double getLength()
	{
		return length;
	}

	public void setLength(double length)
	{
		this.length = length;
	}

	@Override
	public double getArea()
	{
		return length*width;
	}

	@Override
	public double getPerimeter()
	{
		return 2.0*(length+width);
	}

	@Override
	public String toString()
	{
		return "Rectangle[Shape[color="+this.color+",filled="+this.filled+"],width="+width+",length="+length+"]";
	}



}