
public class Fish extends Animal{

	public Fish() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fish(String name, int birthyear, int age, boolean sweetAnimal, String ownerName) {
		super(name, birthyear, age, sweetAnimal, ownerName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeSound() {
		System.out.println("blub");
		
	}

}
