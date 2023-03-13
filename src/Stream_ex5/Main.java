package Stream_ex5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4, 5, 3, 9);
		int sum = list.stream().reduce(0, (a, b) -> a + b);
		System.out.println(sum);
		
		sum = list.stream().reduce(1, (a, b) -> a * b);
		System.out.println(sum);
		
		Optional<Integer> sum2 = list.stream().reduce((a, b) -> (a + b));
		System.out.println(sum2.get());
		
		Optional<Integer> max = list.stream().reduce(Integer::max);
		Optional<Integer> min = list.stream().reduce(Integer::min);
		
		System.out.println(max);
		System.out.println(min);
		
	}
}
