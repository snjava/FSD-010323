import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(234);
		set.add(23);
		set.add(24);
		set.add(12);
		set.add(21);
		set.add(21);
		
		System.out.println(set);
		System.out.println(set.size());
		
		System.out.println(set.first());
		System.out.println(set.last());
		
		// return the higher values than the provided value
		System.out.println(set.higher(21)); // 23
		// return the smaller values than the provided value
		System.out.println(set.lower(21)); //12
		
		// return the equal or higher values than the provided value
		System.out.println(set.ceiling(20)); // 21
		// return the equal or smaller values than the provided value
		System.out.println(set.floor(20)); // 12
		
		NavigableSet set1 = set.descendingSet();
		System.out.println(set1);
		
		System.out.println(set.headSet(20));
		System.out.println(set.tailSet(20));
		
	}
}
