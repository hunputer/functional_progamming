package Predicate_ex2;

public class Main {

	public static void main(String[] args) {
		Predicate<String> predicate = (strValue) -> strValue.startsWith("A");
		
		System.out.println(predicate.test("ABC"));
		System.out.println(predicate.test("BAC"));
		System.out.println(predicate.test("BBC"));

	}

}
