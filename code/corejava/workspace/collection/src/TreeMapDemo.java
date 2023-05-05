import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap map = new TreeMap();
		map.put(5, "May");
		map.put(2, "Feb");
		map.put(3, "March");
		map.put(10, "Oct");
		map.put(11, "Nov");
		map.put(1, "Jan");
		map.put(4, "April");
		map.put(6, "June");
		map.put(9, "Sept");
		map.put(7, "July");
		map.put(8, "Aug");
		map.put(12, "Dec");
		System.out.println(map);
		System.out.println(map.values());
		System.out.println(map.keySet());
		
		System.out.println(map.tailMap(5));
		System.out.println(map.headMap(5));
		
		System.out.println(map.higherKey(5));
		System.out.println(map.higherEntry(5));
		
		System.out.println(map.lowerKey(5));
		System.out.println(map.lowerEntry(5));
		
		System.out.println(map.firstKey());
		System.out.println(map.firstEntry());
		
		System.out.println(map.lastKey());
		System.out.println(map.lastEntry());
	}
}













