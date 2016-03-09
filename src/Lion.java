
public class Lion extends Cat{
	
	public Lion()
	{
		super();
	}
	public Lion(int years)
	{
		super(years);
	}
	public Lion(int years, String color)
	{
		super(years, color);
	}
	
	public void pounce()
	{
		System.out.printf("%s pounces.%n", this.getClass().getName());
	}
	
	@Override
	public void vocalize()
	{
		System.out.printf("%s roars.%n", this.getClass().getName());
	}
}
