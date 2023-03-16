package stream_ex7;

import java.util.Arrays;
import java.util.List;

import stream_ex7.Dish;

public class Main {

	public static void main(String[] args) {
		List<Dish> menu = Arrays.asList(
	              new Dish("pork", false, 800, Dish.Type.MEAT),
	              new Dish("beef", false, 700, Dish.Type.MEAT),
	              new Dish("chicken", false, 400, Dish.Type.MEAT),
	              new Dish("french fries", false, 530, Dish.Type.OTHER),
	              new Dish("rice", false, 350, Dish.Type.OTHER),
	              new Dish("season fruit", false, 120, Dish.Type.OTHER),
	              new Dish("pizza", false, 550, Dish.Type.OTHER),
	              new Dish("prawns", false, 300, Dish.Type.FISH),
	              new Dish("salmon", false, 450, Dish.Type.FISH)
	              );
		
		int calories = menu.stream().mapToInt(m -> m.getCalories()).sum();
		
		System.out.println(calories);

	}

}
