package stream_ex8;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		
		//스트림 만들기
		Stream<String> stream = Stream.of("abc", "cd", "kkk", "bid");
		stream.map(String::toUpperCase).forEach(System.out::println);
		
		//null 값 체크
		String homeValue = "ABC";
		Stream<String> homeValueStream = homeValue == null ? Stream.empty() : Stream.of(homeValue);
		
		homeValueStream.forEach(System.out::println);
		
		//무한 스트림
		Stream.iterate(1, n -> n * 2).limit(5).forEach(System.out::println);
		
		//무한 스트림을 이용한 피보나치수열 
		Stream.iterate(new int[]{0,1}, t-> new int[] {t[1] ,t[1] + t[0]}).map(t->t[0]).limit(20).forEach(System.out::println);
		
		//스트림을 활용한 랜덤값 출력
		Stream.generate(Math::random).limit(5).forEach(System.out::println);
		
		
	}

}
