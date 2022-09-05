package ua.itea.homework;

@Color(color = "White")
public class Cat7 extends Cat{

	public Cat7(String name, int age) {
		super(name, age);
	}
	
	public void walkingWithCat() {
		System.out.println("I like to walk with my cat");
	}
	
	public void playingWithCat() {
		System.out.println("I like to play with my cat");
	}
	
	public String getAgeAndName() {
		return getName() + getAge();
	}
	
	public void eatingCat() {
		System.out.println("I like to eat");
	}
	
	@Override
	public String getInformation() {
		return "I am the cat with more then three methods";
	}
}
