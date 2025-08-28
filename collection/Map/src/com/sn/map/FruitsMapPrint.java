package com.sn.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FruitsMapPrint {
	public static void main(String[] args) {
		Map<Integer, String> fruitsName = new HashMap<>();
		fruitsName.put(104, "Apple");
		fruitsName.put(102, "Guava");
		fruitsName.put(101, "Pomegranate");
		fruitsName.put(103, "Banana");

		Set entrySet = fruitsName.entrySet();

		Iterator itr = entrySet.iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, String> next = (Map.Entry) itr.next();
			System.out.println(next.getKey() + " " + next.getValue());
		}
	}
}


/*
 * HashMap does not guarantee or maintain order. The order of elements when
 * iterating over a HashMap is not predictable and can change over time, even
 * with no modifications to the map. This is because HashMap relies on hashing
 * for efficient storage and retrieval, which does not inherently preserve the
 * order in which elements were added.
 */
