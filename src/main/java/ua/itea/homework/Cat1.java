package ua.itea.homework;

@Color(color = "Gray")
public class Cat1 extends Cat {

	public Cat1(String name, int age) {
		super(name, age);
	}

	@Override
	public String getInformation() {
		return "I am the cat with age " + getAge() + " and color Gray";
	}
}
