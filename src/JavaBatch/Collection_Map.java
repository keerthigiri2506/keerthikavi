package JavaBatch;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class Collection_Map {
	public static void main(String[] args) {
		Map<Integer, Object> m = new TreeMap<>();
		m.put(1, "Java");
		m.put(2, 'C');
		m.put(3, true);
		m.put(4, 500.90);
		m.put(5, 60);
		m.put(5, 50);
		m.put(6, "Java");
 		m.put(6, null);
		System.out.println(m);
		
		Object object = m.get(3);
		System.out.println(object);
		
		boolean containsKey = m.containsKey(4);
		System.out.println(containsKey);
		
		
		boolean containsValue = m.containsValue('C');
		System.out.println(containsValue);
		
		int size = m.size();
		System.out.println(size);
		
		Set<Integer> keySet = m.keySet();
		System.out.println(keySet);
		
		Collection<Object> values = m.values();
		System.out.println(values);
		
		Set<Entry<Integer, Object>> entrySet = m.entrySet();
		System.out.println(entrySet);
		
		for (Entry<Integer, Object> entry : entrySet) {
			System.out.println(entry);
			
		}
		
		
		
		
		
	}

}
