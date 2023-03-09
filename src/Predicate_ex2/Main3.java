package Predicate_ex2;

public class Main3 {

	public static void main(String[] args) {
		Predicate<String> predicate = (strValue) -> strValue.startsWith("A");
		Predicate<String> predicate2 = (strValue) -> strValue.endsWith("K");
		
		System.out.println(predicate.or((strValue) -> strValue.endsWith("Z")).test("ABC"));
		System.out.println(predicate.or(predicate2).test("ABK"));

	}

}
