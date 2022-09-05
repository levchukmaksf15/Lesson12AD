package ua.itea.homework;

@ThinAble
@Color(color = "YELLOW")
public class Cat6 extends Cat{

	public Cat6(String name, int age) {
		super(name, age);
	}

	@Override
	public String getInformation() {
		return "I am the cat with @ThinAble annotation and color YELLOW";
	}
}
