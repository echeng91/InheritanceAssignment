
public class Cat extends Animal{

	private String furColor;
	
	public Cat()
	{
		super();
	}
	
	public Cat(int years)
	{
		super(years);
	}
	
	public Cat(int years, String color)
	{
		super(years);
		furColor = color;
		System.out.printf("%s\'s fur is %s.%n", this.getClass().getName(), furColor);
	}
	
	public void vocalize()
	{
		System.out.printf("%s purrs.%n", this.getClass().getName());
	}
}
