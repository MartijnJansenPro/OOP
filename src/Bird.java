
public class Bird extends Animal {

	public Bird() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bird(String name, int birthyear, int age, boolean sweetAnimal, String ownerName) {
		super(name, birthyear, age, sweetAnimal, ownerName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeSound() {
		System.out.println("tweetweet");
		
	}

}
