package collections;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("anand");
		list.add(31);
		list.add(true);


		/*
		  Object[] obj = new Object[3];
		  obj[0] = "anand";
		  obj[1]=31;
		  obj[2]=true;
		 */
		
		for(Object o:list)
		{
			System.out.println(o);
		}
	}

}
