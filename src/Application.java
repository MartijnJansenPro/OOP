
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnimalShop animalShop = new AnimalShop();
		
		Cat cat1 = new Cat("Pussy", 2015, 8, false, "Gerhard");
		System.out.println(cat1.getAge());
		
		Bird bird1 = new Bird("Rachel", 2001, 22, true, "Martijn");
		System.out.println(bird1.getAge());
		
		Dog dog1 = new Dog("LeraarMartijn", 1965, 58, false, "Rachel");
		System.out.println("This is a dog named: " + dog1.getName() +" This dog is very old. He is born in: " + dog1.getBirthyear() +
				" This means that this dog is " + dog1.getAge() + " years old!");
		
		Fish fish1=new Fish("Goldie", 2022, 2, true, "Pepijn");
		System.out.println(fish1.getAge());
		
		
		Hamster hamster1 = new Hamster("Hammie", 2020, 3, true, "Arno");
		System.out.println(hamster1.getAge());
		
		animalShop.addAnimal(hamster1);
		animalShop.addAnimal(fish1);
		animalShop.addAnimal(cat1);
		animalShop.addAnimal(bird1);
		animalShop.addAnimal(dog1);
		
		animalShop.makeAnimalsSounds();
		
	}
	
	

}
