package ua.itea.homework;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;

public class FreshCatFarchFactory {
	private Cat[] cats;

	public FreshCatFarchFactory(Cat[] cats) {
		this.cats = cats;
	}

	public void selecting()
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		for (Cat cat : cats) {
			Class cl = cat.getClass();
			Annotation colorAnn = cl.getAnnotation(Color.class);

			Field ageField = cl.getSuperclass().getDeclaredField("age");
			ageField.setAccessible(true);
			Field nameField = cl.getSuperclass().getDeclaredField("name");
			nameField.setAccessible(true);

			if (cl.isAnnotationPresent(ThinAble.class) || cl.isAnnotationPresent(FatAble.class)				//if cat has annotations @FleaAble, @OneLegAble					
					|| cl.isAnnotationPresent(OneEyeAble.class) || cl.isAnnotationPresent(OneLegAble.class) // @ThinAble, @FatAble, @OneEyeAble
					|| cl.isAnnotationPresent(FleaAble.class) || ageField.getInt(cat) > 10	//if cat is more than 10 years 
					|| colorAnn != null && colorAnn.toString().contains("RED")				//if cat has annotation color with value RED
					|| cl.getMethods().length - cl.getSuperclass().getMethods().length > 3) { //if cat has more then three methods

				System.out.println(cat.getInformation());
				System.out.println(nameField.get(cat) + " not on the farch!!!\n");
			} else {
				System.out.println(cat.getInformation());
				System.out.println(nameField.get(cat) + " on the farch!!!\n");
			}

		}
	}
}
