package basic.ine;

public class Ops {

	
	public static void main(String[] args) {
		// We can't create object for interface
		Cat c = new Cat();
		c.eat();
		c.sleep();
		
		Dog d = new Dog();
		d.eat();
		d.sleep();
		d.king();
		
		Animal ani = new Dog();
		ani.eat();
		ani.sleep();
		
		Animal ani2 = new Cat();
		ani2.eat();
		ani2.sleep();
	}
}
