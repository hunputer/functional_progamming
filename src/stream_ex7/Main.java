package stream_ex7;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

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
		
		//칼로리의 모든 합
		int calories = menu.stream().mapToInt(m -> m.getCalories()).sum();
		System.out.println(calories);
		
		double calories_double = menu.stream().mapToDouble(Dish::getCalories).sum();
		System.out.println(calories);
		
		long calories_Long = menu.stream().mapToLong(Dish::getCalories).sum();
		System.out.println(calories_Long);
		
		//칼로리 최대값
		OptionalInt maxCalories = menu.stream().mapToInt(Dish::getCalories).max();
		System.out.println(maxCalories.orElse(1));
		
		//칼로리 최소값
		OptionalInt minCalories = menu.stream().mapToInt(Dish::getCalories).min();
		System.out.println(minCalories.getAsInt());
		
		//범위 내 짝수 카운트
		IntStream evenNumbers = IntStream.rangeClosed(1, 100).filter(n -> n % 2 == 0);
		System.out.println(evenNumbers.count());

	}

}
