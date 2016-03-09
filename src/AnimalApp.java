
public class AnimalApp {

	public static void main(String[] args) {

		Animal a = new Animal();
		a.eat();
		a.sleep();

		Cat c = new Cat(5, "calico");
		c.eat();
		c.sleep();
		c.vocalize();

		Bird b = new Bird(3);
		b.eat();
		b.sleep();
		b.fly();
		
		Fish f = new Fish();
		f.eat();
		f.sleep();
		f.swim();
		f.setAge(2);
		System.out.println(f.getClass().getName() + " is " + f.getAge() + " years of age.");

		Lion l = new Lion(10, "gold");
		l.eat();
		l.sleep();
		l.vocalize();
	}
}