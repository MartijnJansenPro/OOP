import java.util.ArrayList;
import java.util.List;

public class AnimalShop {

	private List<Animal> animals = new ArrayList<>();
	
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}
	
	//maak een methode om alle dieren in de winkel een 
	//geluid te laten maken
	
	public void makeAnimalsSounds() {
		for(Animal animal: animals) {
			System.out.println(animal.getClass().getSimpleName());
			animal.makeSound();
		}
	}

	
}
