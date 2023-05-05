import java.util.LinkedHashSet;

public class GenericCollection {
	public static void main(String[] args) {
		Integer a = 10; 
		System.out.println(a.toBinaryString(10));
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		set.add(23);
		set.add(33);
		set.add(43);
		set.add(53);
		set.add(63);
		set.add(73);
		
		System.out.println(set);
	}
}
