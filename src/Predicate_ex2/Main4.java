package Predicate_ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main4 {
	public static void main(String[] args) {
		List<String> test1 = Arrays.asList("red", "blue", "green", "red", "green");
		Predicate<String> predicate1 = (String str) -> str.equals("red");
		Predicate<String> predicate2 = (String str) -> str.equals("green");
		
		System.out.println(count(test1, predicate1, null)); //예상 결과값 2
		System.out.println(count(test1, predicate1, predicate2)); //예상 결과값 2

	}
	
	static <T> int count(List<T> list, Predicate<T> predicate1, Predicate<T> predicate2){
		int count = 0;
		if(predicate2 != null) {
			for(T str : list) {
				if(predicate1.or(predicate2).test(str)) {
					count += 1;
				}
			}
		}else {
			for(T str : list) {
				if(predicate1.test(str)) {
					count += 1;
				}
			}			
		}
		
		return count;
	}

}


