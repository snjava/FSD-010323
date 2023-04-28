import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("Abc");
		list.add(9.1);
		list.add("Xyz");
		list.add(34);
		list.add("Pqr");
		list.add("Abc");
		list.add("Lmn");
		list.add(true);
		list.add("Pqr");
		list.add("Stu");
		
		System.out.println(list);
		list.remove("Xyz");
		System.out.println(list.contains("Xyz"));
		System.out.println(list);
		System.out.println(list.size());
		
		ArrayList list2 = new ArrayList();
		list2.add(9.1);
		list2.add("Stu");
		list2.add(34);
		
		System.out.println(list.containsAll(list2));
		
		//list.removeAll(list2);
		
		//list.clear(); // removes all the objects from collection
		
		
		
		//System.out.println(list.isEmpty());
		//System.out.println(list);
		
		
	}
}















