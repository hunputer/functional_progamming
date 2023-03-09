package lamda_ex1;

import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		System.out.println(cal(3, 2, (a,b) -> a - b)); //예상 결과값 1
		System.out.println(cal(5, 2, (a,b) -> a * b)); //예상 결과값 10
		System.out.println(cal(5, 7, (a,b) -> a + b)); //예상 결과값 12
		System.out.println(cal(14, 2, (a,b) -> a / b)); //예상 결과값 7
		System.out.println(cal(14, 3, (a,b) -> a % b)); //예상 결과값 2
	}
	
	static <T> int cal(T a, T b, Calculator<T> cal){
		return cal.calc(a, b);
	}

}
