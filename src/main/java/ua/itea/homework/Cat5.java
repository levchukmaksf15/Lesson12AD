package ua.itea.homework;

@OneLegAble
@Color(color = "BLUE")
public class Cat5 extends Cat {

	public Cat5(String name, int age) {
		super(name, age);
	}

	@Override
	public String getInformation() {
		return "I am the cat with @OneLegAble annotation and color BLUE";
	}
}