package Question_25;
import java.util.Arrays;
import java.util.List;
public class forEachMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> values= Arrays.asList(1,2,3,4);
//-> is called Lambda expression
values.forEach(i -> System.out.println(i));

	}

}
