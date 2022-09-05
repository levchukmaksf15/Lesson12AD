package ua.itea.homework;

@Color(color = "RED")
public class Cat8 extends Cat{

	public Cat8(String name, int age) {
		super(name, age);
	}

	@Override
	public String getInformation() {
		return "I am the cat with color RED";
	}

}
