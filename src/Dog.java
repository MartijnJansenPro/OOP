
public class Dog extends Animal {

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, int birthyear, int age, boolean sweetAnimal, String ownerName) {
		super(name, birthyear, age, sweetAnimal, ownerName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeSound() {
		System.out.println("waf");
		
	}

}
