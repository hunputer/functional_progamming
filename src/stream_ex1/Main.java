package stream_ex1;

import java.util.Arrays;
import java.util.List;
import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

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
	
		// 400칼로리 이하 음식 필터링 및 정렬 후 List 적용 
		List<String> lowCaloricDishesName = 
									menu.stream()
									    .filter(d -> d.getCalories() < 400)
									    .sorted(comparing(Dish::getCalories))
									    .map(Dish::getName)
									    .collect(toList());
		for(String str : lowCaloricDishesName) {
			System.out.println(str);
		}
		
		// 300칼로리 이상 음식 필터링 및 3개추출 List 적용 
		List<String> threeHighCaloricDishNames =
									menu.stream()
										.filter(d -> d.getCalories() > 300)
										.map(d -> d.getName())
										.limit(3)
										.collect(toList());
		for(String str : threeHighCaloricDishNames) {
			System.out.println(str);
		}
		
		
		//필터링 후 필터링 된 갯수 출력
		long count = menu.stream()
						 .filter(d -> d.getCalories() > 300)
						 .distinct()
						 .limit(3)
						 .count();
		System.out.println(count);
		
		
		//forEach로 바로 출력 
		menu.stream()
		    .filter(d -> d.getCalories() < 400)
		    .sorted(comparing(Dish::getCalories))
		    .map(Dish::getName)
		    .forEach(System.out::println);
		
		menu.stream()
			.filter(d -> d.getCalories() > 300)
			.map(d -> d.getName())
			.limit(3)
			.forEach(System.out::println);

	}

}
