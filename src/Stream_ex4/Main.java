package Stream_ex4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import stream_ex1.Dish;

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
		
		//filter and 조건 확인
		List<String> filterMenuName = menu.stream().filter(dish -> ("pork".equals(dish.getName()) || dish.getCalories() < 400)).map(Dish::getName).collect(Collectors.toList());
		System.out.println(filterMenuName);
		
		//filter not 조건 확인
		List<String> filterMenuName2 = menu.stream().filter(dish -> !(dish.getCalories() < 400)).map(Dish::getName).collect(Collectors.toList());
		System.out.println(filterMenuName2);
		
		//noneMatch 확인
		boolean isNone = menu.stream().noneMatch(dish -> dish.getCalories() > 1000);
		System.out.println(isNone);
		
		//allMatch 확인
		boolean isAll = menu.stream().allMatch(dish -> dish.getCalories() < 1000);
		System.out.println(isAll);
		
	}

}
