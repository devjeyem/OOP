public class Point3D extends Point2D
{
	private float z;

	Point3D(float x,float y,float z)
	{
		super(x,y);
		this.z = z;
	}

	Point3D()
	{
		super();
		this.z =z;
	}

	public float getZ()
	{
		return z;
	}

	public void setZ(float z)
	{
		this.z = z;
	}

	public void setXYZ(float x,float y, float z)
	{
		super.setX(x);
		super.setY(y);
		this.z =z;
	}

	public float[] getXYZ()
	{
		return new float[]{super.getX(),super.getY(),z};
	}

	@Override()
	public String toString()
	{
		return "("+super.getX(x)+","+super.getY(y)+","+z+")";
	}
}