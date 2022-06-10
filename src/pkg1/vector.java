package pkg1;

import java.util.ListIterator;

public class vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		vector vList = new vector();	
		
		vList.add('@');
		vList.add('#');
		vList.add('%');
		vList.add('&');
		vList.add('*');
		
		System.out.println(vList);
		ListIterator lItr = vList.listIterator();
		while(lItr.hasNext())
		{
			System.out.println(lItr.next());
		}
		while(lItr.hasNext())
		{
			System.out.println(lItr.previous());
		}
		}

	private ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	private void add(char c) {
		// TODO Auto-generated method stub
		
	}

		
	}


