package stream_ex2;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Person> list1 = Person.createShortList();
		List<Person> list2;
		Set<Person> list3;
		
		Predicate<Person> predicate1 = p -> p.getAge() > 16;
		list2 = list1.stream().filter(predicate1).collect(Collectors.toList());
		
		list2.forEach(
				p -> {
					System.out.println(p.getSurName());
					System.out.println(p.getGender());
				}
		);
		
		Map<String, Integer> intMap = list1.stream().filter(predicate1).collect(Collectors.toMap(p -> p.getSurName(), p -> p.getAge()));
		System.out.println(intMap);

	}

}
