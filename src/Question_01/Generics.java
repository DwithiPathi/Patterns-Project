package Question_01;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class Generics {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[ ] =new int[4];
		//collection with generic
				Collection<Integer> values=new ArrayList<Integer>();
				values.add(5);
				values.add(6);
				values.add(9);
				System.out.println(values);
				//generic iterator interface
				Iterator it = values.iterator();
				while(it.hasNext())
				{
				System.out.println(it.next());
				}	
			}

	}


