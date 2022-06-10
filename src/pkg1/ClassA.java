package pkg1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Integer>list = new  ArrayList<>();
		
		list.add(10);
		list.add(85);
		list.add(96);
		list.add(50);
		list.add(245);

		//get size of list
		System.out.println(list.size());
		
		//using set method
		list.set(2, 100);
		System.out.println(list);
		
		//list in reverse
		
		Collections.reverse(list);
		System.out.println(list);
		
		System.out.println(list.isEmpty());
		System.out.println(list.get(3));

		
		ArrayList <String>list1 = new ArrayList<>();
		list1.add("Bike");
		list1.add("Car");
		list1.add("Truck");
		list1.add("Plain");
		list1.add("Bus");
		System.out.println(list1);
		
		Collections.sort(list1);
		System.out.println(list1);
		
		//Question
	//	sum all integers from the given arreyList of object.
		
	//sum all integers	  //--------->
	
		
		ArrayList<Object> list2 = new ArrayList<>();
		list2.add(10);
		list2.add("velocity");
		list2.add("%");
		list2.add(50);
        list2.add("classes");
		list2.add("63");
		list2.add('#');
		list2.add(78);
		
		int sum = 0;
		for(Object k:list2)
		{
			try {
				sum = sum + Integer.parseInt(k.toString());
			}catch(Exception ee)
			{
				System.out.println(ee);
			}
			}
		System.out.println(sum);
		}
		}
			
		
		
