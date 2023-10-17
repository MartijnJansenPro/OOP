
public class Hamster extends Animal{

	public Hamster() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hamster(String name, int birthyear, int age, boolean sweetAnimal, String ownerName) {
		super(name, birthyear, age, sweetAnimal, ownerName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeSound() {
		System.out.println("hamsteereeeeeeeeeeeeeeeen!");
		
	}

}
