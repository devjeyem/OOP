public class Main
{
	public static void main(String[] args)
	{
		Animal a1 = new Dog("Mew");	
		

		Dog d1 = (Dog)a1;
		Dog d2 = new Dog("Irving");
		d1.greets(d2);

		BigDog b1 = new BigDog("tem");
		BigDog b2 = new BigDog("Pan");
		b1.greets(b2);
		b1.greets(d1);

	}
}

abstract class Animal
{
	private String name;

	Animal(String name)
	{
		this.name = name;
	}

	public abstract void greets();
}

class Cat extends Animal
{
	Cat(String name)
	{
		super(name);
	}

	@Override
	public void greets()
	{
		System.out.println("Meow");
	}
}

class Dog extends Animal
{
	Dog(String name)
	{
		super(name);
	}

	@Override
	public void greets()
	{
		System.out.println("Woof");
	}

	public void greets(Dog another)
	{
		System.out.println("Woooof");
	}

}

class BigDog extends Dog
{
	BigDog(String name)
	{
		super(name);
	}

	@Override
	public void greets()
	{
		System.out.println("Wooow");
	}

	@Override
	public void greets(Dog another)
	{
		System.out.println("Woooooow");
	}

	public void greets(BigDog another)
	{
		System.out.println("Woooooooooww");
	}
}