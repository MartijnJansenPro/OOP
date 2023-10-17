
public class Cat extends Animal {

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cat(String name, int birthyear, int age, boolean sweetAnimal, String ownerName) {
		super(name, birthyear, age, sweetAnimal, ownerName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeSound() {
		System.out.println("miauw");
		
	}

	
}
