import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(5);
		list.add(12);
		list.add(1.2);
		list.add("Abc");
		list.add("Xyz");
		list.add(121);
		
		System.out.println(list);
		
		list.add(1, 222); // to add value on specific index;
		System.out.println(list);
		
		list.remove(0); // to remove value from specific index
		System.out.println(list);
		
		System.out.println(list.get(3)); // to get the value from specific index
		
		list.set(2, "PQR"); // to update/replace the value from the specific index
		System.out.println(list);
		
	}

}
