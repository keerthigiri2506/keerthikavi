package JavaBatch;

import java.util.ArrayList;
import java.util.List;

public class Collection_List {
	public static void main(String[] args) {
		List<Object>li = new ArrayList<>();
		li.add(10);
		li.add("Java");
		li.add('C');
		li.add(true);
		li.add(50.25);
		System.out.println(li);
		
		li.add(3.70);
		System.out.println(li);
		
		boolean contains = li.contains(30);
		System.out.println(contains);
		
		Object object = li.get(2);
		System.out.println(object);
		
		li.set(1, "Class");
		System.out.println(li);
		
		li.remove(2);
		System.out.println(li);
		
		int size = li.size();
		System.out.println(size);
		
		li.clear();
		System.out.println(li);
		
	}

}
