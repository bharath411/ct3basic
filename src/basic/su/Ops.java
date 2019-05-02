package basic.su;

public class Ops {

	
	public static void main(String[] args) {
		
		
		Dog dog = new Dog();
		dog.eat();
		dog.sleep();
		dog.king();
		
		Cat cat = new Cat();
		cat.eat();
		cat.sleep();
		
		Animal ani = new Animal();
		ani.eat();
		ani.sleep();
		
		Animal ani2 = new Dog();
		ani2.eat();
		ani2.sleep();
		
		Animal ani3 = new Cat();
		ani3.eat();
		ani3.sleep();
		
	}
}
