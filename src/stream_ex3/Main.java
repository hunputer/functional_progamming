package stream_ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("Hello", "World");
		
		//flatMap 사용을 통한 하나의 스트림으로 적용
		List<String> spellList = words.stream().map(word -> word.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
		System.out.println(spellList.toString());
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		
		List<Integer> zegopList = list.stream().map(num -> num * num).collect(Collectors.toList());
		System.out.println(zegopList.toString());
		
		//flatMap 사용을 통한 list_first와 list_second의 모든 숫자 쌍의 리스트 반환
		List<Integer> list_first = Arrays.asList(1, 2 ,3);
		List<Integer> list_second = Arrays.asList(3, 4);
		
		List<int[]> pairs = list_first.stream().flatMap(i -> list_second.stream().map(j->new int[] {i,j})).collect(Collectors.toList());
		
		for(int[] pair : pairs) {
			System.out.println("("+pair[0]+", "+pair[1]+")");
		}
		
		
		//flatMap 사용을 통한 list_first와 list_second의 쌍에서 3으로 나눠 떨어지는 리스트 반환
		List<int[]> pairs2 = list_first.stream().flatMap(i -> list_second.stream()
																		 .filter(j -> (i+j)%3 == 0)
				                                                         .map(j->new int[] {i,j})).collect(Collectors.toList());
		for(int[] pair : pairs2) {
			System.out.println("("+pair[0]+", "+pair[1]+")");
		}

	}

}
