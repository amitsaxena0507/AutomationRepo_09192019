package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapInterface {

	public static void main(String[] args) 
	{
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1234,"Amit");
		map.put(2345,"Teju");
		map.put(1245,"shubhada");
		map.put(null,"asfsah");
		System.out.println(map.get(1234));
		System.out.println(map.get(null));
		
		/*for(Object i:map.keySet())
		{
			System.out.println(map.get(i));
		}*/
		
		Set<Integer> set=map.keySet();
		Iterator<Integer> it = set.iterator();
		while(it.hasNext())
		{
			System.out.println(map.get(it.next()));
			
		}
	}
}