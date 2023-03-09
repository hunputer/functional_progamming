package lamda_ex2;

import java.util.List;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		Apple apple = new Apple();
		apple.setWeight(4.5);
		apple.setColor("red");
		
		Predicate<Apple> predicate1 = (app) -> app.getWeight() > 3.0;
		Predicate<Apple> predicate2 = (app) -> app.getColor().equals("red");
		
		System.out.println(check(apple, predicate1, predicate2));// 예상결과값 true
	}
	
	static <T> boolean check(T t, Predicate<T> predicate1, Predicate<T> predicate2) {
		if(predicate1.and(predicate2).test(t)) {
			return true;
		}else {
			return false;
		}
	}

}
