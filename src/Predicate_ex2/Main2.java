package Predicate_ex2;

public class Main2 {
	public static void main(String[] args) {
		Predicate<String> predicate = (strValue) -> strValue.startsWith("A");
		Predicate<String> predicate2 = (strValue)->strValue.endsWith("Z");
		Predicate<String> predicate3 = (strValue)->strValue.length()>2;
		
		System.out.println(predicate.and(((strValue)->strValue.endsWith("Z"))).test("ABC"));
		System.out.println(predicate.and(((strValue)->strValue.endsWith("Z"))).test("ABC"));
		System.out.println(predicate.and(predicate2).test("ABZ"));
		System.out.println(predicate.and(predicate2.and(predicate3)).test("ABZ"));

	}
}
