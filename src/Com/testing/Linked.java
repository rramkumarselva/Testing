package Com.testing;

import java.util.ArrayList;
import java.util.LinkedList;

public class Linked {

	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		
		
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		a1.add(60);
		a1.add(70);
		a1.add(80);
		
		System.out.println(a1);
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.addAll(a1);
		ll.add(1000);
		ll.add(2000);
		ll.add(3000);
		System.out.println(ll);
		
		ll.retainAll(a1);
		System.out.println(ll);
		
		ll.removeAll(a1);
		System.out.println(ll);
		
		
	}

}
