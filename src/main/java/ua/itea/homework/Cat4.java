package ua.itea.homework;

@OneEyeAble
@Color(color = "RED")
public class Cat4 extends Cat{

	public Cat4(String name, int age) {
		super(name, age);
	}

	@Override
	public String getInformation() {
		return "I am the cat with @OneEyeAble annotation and color RED";
	}
}
