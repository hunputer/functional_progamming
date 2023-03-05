package predicate_ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class main {
	
	public static void main(String[] args) throws Exception {
		List<String> lists = new ArrayList<String>();
		lists.add("a");
		lists.add("");
		lists.add("abcde");
		
		Predicate<String> nonEmptyStringPredicate = (String a) -> !a.isEmpty();
		List<String> nonEmpty = filter(lists, nonEmptyStringPredicate);
		
		for(String str : nonEmpty) {
			System.out.println(str);
		}
	}
	
	public static <T> List<T> filter(List<T> list, Predicate<T> p){
		List<T> results = new ArrayList<T>();
		for(T t : list) {
			if(p.test(t)) {
				results.add(t);
			}
		}
		
		return results;
	}

}
