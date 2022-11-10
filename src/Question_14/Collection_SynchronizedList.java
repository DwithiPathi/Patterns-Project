package Question_14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Collection_SynchronizedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Collections.synchronizedList(new ArrayList<String>());
		 
		        list.add("a");
		        list.add("b");
		        list.add("c");
		 
		        synchronized(list)
		        {
		            // must be in synchronized block
		            Iterator it = list.iterator();
		 
		            while (it.hasNext())
		                System.out.println(it.next());
		        }
	}

}
