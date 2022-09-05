package ua.itea.homework;

public class CatFactoryMain {

	public static void main(String[] args) {

		Cat[] cats = new Cat[8];

		cats[0] = new Cat5("Cat5", 7);
		cats[1] = new Cat1("Cat1", 15);
		cats[2] = new Cat4("Cat4", 5);
		cats[3] = new Cat6("Cat6", 2);
		cats[4] = new Cat2("Cat2", 9);
		
		cats[5] = new Cat3("Cat3", 1);
		cats[6] = new Cat7("Cat7", 6);
		cats[7] = new Cat8("Cat7", 5);

		FreshCatFarchFactory factory = new FreshCatFarchFactory(cats);
		try {
			try {
				factory.selecting();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}

}
