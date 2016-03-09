
public class Animal {

	private int age;
	
	public Animal()
	{
		age = 0;
		System.out.printf("%s is born.%n", this.getClass().getName());
	}
	public Animal(int years)
	{
		age = years;
		System.out.printf("%s is %d years of age.%n", this.getClass().getName(), age);
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int years)
	{
		age = years;
	}
	
	
	public void eat()
	{
		System.out.printf("%s is eating.%n", this.getClass().getName());
	}
	public void sleep()
	{
		System.out.printf("%s is sleeping.%n", this.getClass().getName());
	}
}
