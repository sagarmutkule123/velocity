package pkg1;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer>list1=new ArrayList<>();
		list1.add(10);
		list1.add(85);
		list1.add(96);
		list1.add(50);
		list1.add(245);
		list1.add(50);
		list1.add(49);
		
System.out.println(list1.size());

list1.set(4, 245);
System.out.println(list1);

Collections.reverse(list1);
System.out.println(list1);

Collections.sort(list1);
System.out.println(list1);

ArrayList<String>list2=new ArrayList<>();

list2.add("abc");
list2.add("sad");
list2.add("tyu");
list2.add("rty");
list2.add("gfd");
list2.add("rtyd");
list2.add("tyui");

System.out.println(list2.size());

list2.set(5,"try" );
System.out.println(list2);

Collections.reverse(list2);



System.out.println(list2);
	}

}
