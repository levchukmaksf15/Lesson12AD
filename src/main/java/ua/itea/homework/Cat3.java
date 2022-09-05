package ua.itea.homework;

@Color(color = "BLUE")
public class Cat3 extends Cat{

	public Cat3(String name, int age) {
		super(name, age);
	}

	@Override
	public String getInformation() {
		return "I am the cat with color BLUE";
	}

}