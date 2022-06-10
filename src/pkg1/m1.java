

	package pkg1;

import java.util.Arrays;

public class m1 {

	public static void main(String[]args) {

	String a = "india is my country";
	String[] b = a.split(" ");
	System.out.println(Arrays.toString(b));

	for(int i=0;i<(b.length-1);i++)
	{
	String c=b[i];
	int count = 0;
	for(int j=i+1;j<(b.length);j++)
	{
	String d= b[j];
	if(c.equals(d))
	{
	count= count+1;
	}
	}
	System.out.println(c+"repited" +count + "times");
	}
	System.out.println(Arrays.toString(b));
}
	}