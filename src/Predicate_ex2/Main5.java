package Predicate_ex2;

import java.util.Arrays;
import java.util.List;

public class Main5 {
	public static void main(String[] args) {
		List<Integer> test1 = Arrays.asList(8, 9, 4, 7, 2);
		Predicate<Integer> predicate1 = (a) -> a >= 4;
		Predicate<Integer> predicate2 = (a) -> a < 8;
		Predicate<Integer> predicate3 = (a) -> a < 3;
		
		System.out.println(count(test1, predicate1, predicate2, "AND")); //예상결과값 2
		System.out.println(count(test1, predicate1, predicate3, "OR")); //예상결과값 5
		
		
	}

	static <T> int count(List<T> list, Predicate<T> predicate1, Predicate<T> predicate2, String method) {
		int count = 0;
		
		if(predicate2 != null) {
			if(method.equals("AND")) {
				for(T t : list) {
					if(predicate1.and(predicate2).test(t)) {
						count += 1;
					}
				}			
			}else if(method.equals("OR")) {
				for(T t : list) {
					if(predicate1.or(predicate2).test(t)) {
						count += 1;
					}
				}
			}
		}else {
			for(T t : list) {
				if(predicate1.test(t)) {
					count += 1;
				}
			}
		}
		
		return count;
	}
}
