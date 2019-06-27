package com.cn.ustb.mouse.advanced;
import java.util.*;

public class TestIterator {
	public static void main(String[] args) {
		Collection<String> collection = new ArrayList<>();
		collection.add("New York");
		collection.add("Atlanta");
		collection.add("Dallas");
		collection.add("Madison");
		
		Iterator<String> iterator = collection.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next().toUpperCase() + " ");
		}
		System.out.println();
		
		//可以使用foreach循环来简化，而不实用迭代器
		for (String element: collection)
			System.out.print(element.toUpperCase() + " ");
		System.out.println();
	}
}
