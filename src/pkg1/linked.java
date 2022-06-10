package pkg1;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class linked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		System.out.println(list.get(2));
		
		Collections.reverse(list);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		list.set(3, 456);
		System.out.println(list);
		
		list.add(4, 500);
		
		System.out.println(list);
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
	}}

}
