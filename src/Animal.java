
public abstract class Animal {

	protected String name;
	protected int birthyear;
	protected int age;
	protected boolean sweetAnimal;
	protected String ownerName;
	
	public Animal() {
		
	}
	
	public Animal(String name, int birthyear, int age, boolean sweetAnimal, String ownerName) {
		super();
		this.name = name;
		this.birthyear = birthyear;
		this.age = age;
		this.sweetAnimal = sweetAnimal;
		this.ownerName = ownerName;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirthyear() {
		return birthyear;
	}
	public void setBirthyear(int birthyear) {
		this.birthyear = birthyear;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isSweetAnimal() {
		return sweetAnimal;
	}
	public void setSweetAnimal(boolean sweetAnimal) {
		this.sweetAnimal = sweetAnimal;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public abstract void makeSound();
	
}

