package Question_17;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 CopyOnWriteArrayList<Integer> list= new CopyOnWriteArrayList<Integer>(new Integer[] { 1, 3, 5, 8 });
     Iterator itr = list.iterator();
     while (itr.hasNext()) {
         Integer no = (Integer)itr.next();
         System.out.println(no);
         if (no == 8)

             // This will not print,
             // hence it has created separate copy
             list.add(14);
     }
	}

}
