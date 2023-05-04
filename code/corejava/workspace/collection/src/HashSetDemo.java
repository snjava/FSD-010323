import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet set = new LinkedHashSet();
		set.add("ABC");
		set.add(12.3);
		set.add(123);
		set.add("BCA");
		set.add("ABC");
		set.add("XYZ");
		set.add("CBA");
		set.add("YZX");
		
		System.out.println(set);
		System.out.println(set.size());
	}
}
