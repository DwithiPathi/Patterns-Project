package Question_25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Collection<String> strings=Arrays.asList("One","two","Three");
Collection<String> list=new ArrayList<String>(strings);
list.removeIf(s->s.length()>4);
list.forEach(s->System.out.println(s));
List<String> myList1=Arrays.asList("a","b","c");
myList1.replaceAll(s->s+"..");
myList1.forEach(s->System.out.println(s));
	}

}
