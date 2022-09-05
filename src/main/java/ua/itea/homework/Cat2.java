package ua.itea.homework;

@FleaAble
@Color(color = "RED")
public class Cat2 extends Cat {

	public Cat2(String name, int age) {
		super(name, age);
	}

	@Override
	public String getInformation() {
		return "I am the cat with @FleaAble annotation and color RED";
	}
}
