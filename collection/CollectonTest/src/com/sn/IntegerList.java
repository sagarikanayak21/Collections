package com.sn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Stream;

public class IntegerList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

//		Iterator itr = list.iterator();
//		while (itr.hasNext()) {
//			Integer i = (Integer) itr.next();
//			System.out.println(i);
//		}

//		Iterator itr = list.iterator();
//		while(itr.hasNext()) {
//			Integer i = (Integer) itr.next();
//			System.out.print(i + " ");
//		}

//		ListIterator itr = list.listIterator();
//		while(itr.hasNext()) {
//			Integer i = (Integer) itr.next();
//			System.out.print(i + " ");
//		}

//		for(Integer i : list) {
//			System.out.print(i + " ");
//		}

//		for(int i=0; i<list.size(); i++) {
//			Integer in =  list.get(i);
//			System.out.print(in + " ");
//		}

//		list.stream().forEach(x -> {
//			System.out.print(x + " ");
//		});
		
//		list.stream().forEach( x -> System.out.print(x + " "));
		
		list.stream().forEach(System.out::println);
	}
}
