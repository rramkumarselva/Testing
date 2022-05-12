package Com.testing;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Map {

	public static void main(String[] args) 
	
	{
		HashMap<Integer,String> hm =new HashMap<Integer,String>();
		hm.put(2, "Ram");
		hm.put(3, "Kumar");
		hm.put(5, "Rock");
		hm.put(2,"Gugan");
		hm.put(3, "Sing");
		
		System.out.println(hm);
		System.out.println(hm.get(2));
		
	Set<Entry<Integer,String>> x=hm.entrySet();
	
	for(Entry<Integer,String> y:x)
	{
		System.out.println(y);
		System.out.println(y.getValue());
		System.out.println(y.getKey());
	}
	
		

	}

}
