import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(23);
		list.add("Abc");
		list.add(34.32);
		list.add(true);
		
		System.out.println(list);
		list.remove("Abc");
		System.out.println(list);
		
	}
}
