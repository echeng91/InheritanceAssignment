
public class Bird extends Animal{

	public Bird()
	{
		super();
	}
	
	public Bird(int years)
	{
		super(years);
	}
	
	public void fly()
	{
		System.out.printf("%s is flying.%n", this.getClass().getName());
	}
}
