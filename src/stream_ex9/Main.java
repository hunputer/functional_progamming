package stream_ex9;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
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
		
		//그룹핑 함수
		//결과값 
		Map<Dish.Type, List<Dish>> dishesByType = menu.stream().collect(Collectors.groupingBy(t -> t.getType()));
		
		List<Dish> others = dishesByType.get(Dish.Type.OTHER);
		List<Dish> meat = dishesByType.get(Dish.Type.MEAT);
		List<Dish> fish = dishesByType.get(Dish.Type.FISH);
		
		System.out.print("OTHERS : ");
		for(Dish dish : others) {
			System.out.print(dish.getName() + ", ");
		}
		System.out.println();
		
		System.out.print("MEAT : ");
		for(Dish dish : meat) {
			System.out.print(dish.getName() + ", ");
		}		
		System.out.println();
		
		System.out.print("FISH : ");
		for(Dish dish : fish) {
			System.out.print(dish.getName() + ", ");
		}
		System.out.println();
		
		//칼로리 전체함
		int sumCalory = menu.stream().collect(Collectors.summingInt(Dish::getCalories));
		System.out.println(sumCalory);
		
		//칼로리 평균
		double averageCalory = menu.stream().collect(Collectors.averagingDouble(Dish::getCalories));
		System.out.println(averageCalory);
		
		//문자열 연결
		String shortMenu = menu.stream().map(Dish::getName).collect(Collectors.joining(", "));
		System.out.println(shortMenu);
		
	}

}
