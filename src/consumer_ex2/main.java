package consumer_ex2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class main {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("apple", "kiwi", "orange");		
		Consumer<String> printFruit = (String fruit) -> System.out.println(fruit);
		
		forEach(fruits, printFruit);
 
	}
	
	static <T> void forEach(List<T> lists, Consumer<T> consumer) {
		for(T t : lists) {
			consumer.accept(t);
		}
	}

}
