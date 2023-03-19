package Collection_ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		//집합 팩토리 적용
		Set<String> friends = Set.of("Rapheal", "Olivia", "Thibaut");
		System.out.println(friends);
		
		//맵 팩토리 적용
		Map<String, Integer> ageOfFriends = Map.of("Raphael", "30", "Olivia", "25", "Thibaut", 26);
		System.out.println(ageOfFriends);
		
		ageOfFriends.forEach((name, age) -> System.out.println(name + " is " + age + " years old"));
		
	}

}
