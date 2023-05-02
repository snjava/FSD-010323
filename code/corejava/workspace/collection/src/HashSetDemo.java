import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("ABC");
		set.add("BCA");
		set.add("ABC");
		set.add("XYZ");
		set.add("CBA");
		set.add("YZX");
		
		System.out.println(set);
		System.out.println(set.size());
	}
}
