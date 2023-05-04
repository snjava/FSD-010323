import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		//LinkedHashMap map = new LinkedHashMap();
		map.put(123, "Demo1");
		map.put("Xyz", 888);
		map.put(123, "Test1");
		map.put(12.32, "Abc");
		map.put(true, "Test1");
		map.put(111, "Demo1");
		map.put(null, "Abc");
		map.put(321, null);
		map.put(3.21, null);
		
		System.out.println(map);
		map.remove("Xyz");
		System.out.println(map);
		System.out.println(map.containsKey(123)); // true
		System.out.println(map.containsValue(123)); // false
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		System.out.println(map.keySet()); // get the Keys
		System.out.println(map.values()); // get the values
		
		System.out.println(map.get(111));
		
		map.clear();
		System.out.println(map);
		
	}
}












