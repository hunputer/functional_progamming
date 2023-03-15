package stream_ex6;

import static java.util.Comparator.comparing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import stream_ex1.Dish;

public class Main {

	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
				new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000),
				new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710),
				new Transaction(mario, 2012, 700),
				new Transaction(mario, 2012, 700),
				new Transaction(alan, 2012, 950)
		);
		
		//1. 2011년에 일어난 모든 트랜잭션을 찾아 값을 오름차순으로 정리
		List<Transaction> result = transactions.stream().filter(t -> t.getYear() == 2011).sorted(comparing(Transaction::getValue)).collect(Collectors.toList());
		
		for(Transaction t : result) {
			System.out.println(t.toString());
		}
		
		System.out.println();
		
		//2. 거래자가 근무하는 모든 도시를 중복 없이 나열하시오
		List<String> result2 = transactions.stream().map(t -> t.getTrader().getCity()).distinct().collect(Collectors.toList());
		
		for(String str : result2) {
			System.out.println(str);
		}
		
		System.out.println();
		
		//3.케임브리지에서 근무하는 모든 거래자를 찾아서 이름순으로 정렬하시오.
		List<String> result3 = transactions.stream().filter(t -> "Cambridge".equals(t.getTrader().getCity())).distinct().sorted((t1, t2) -> t1.getTrader().getName().compareTo(t2.getTrader().getName())).map(t -> t.getTrader().getName()).distinct().collect(Collectors.toList());
		
		for(String str : result3) {
			System.out.println(str);
		}
		
		System.out.println();
		
		//4.모든 거래자의 이름을 알파벳 순으로 정렬해서 반환하시오
		List<String> result4 = transactions.stream().map(t -> t.getTrader().getName()).distinct().sorted((s1,s2) -> s1.compareTo(s2)).collect(Collectors.toList());
		
		for(String str : result4) {
			System.out.println(str);
		}
		
		System.out.println();
		
		//5.밀라노에 거래자가 있는가?
		boolean isTrader = transactions.stream().anyMatch(t -> "Milan".equals(t.getTrader().getCity()));
		
		System.out.println(isTrader);
		System.out.println();
		
		//6.전체 트랜잭션 중 최댓값은 얼마인가?
		Optional<Integer> result5 = transactions.stream().map(t -> t.getValue()).reduce(Integer::max);
		
		System.out.println(result5.get());
		System.out.println();
		
		//7.전체 트랜잭션 중 최솟값은 얼마인가?
		Optional<Integer> result6 = transactions.stream().map(t -> t.getValue()).reduce(Integer::min);
		System.out.println(result6.get());
		
	}

}
