package Question_08;

public class TryBlockWithoutCatch {
	public static int alwaysExecute() {
	try {
        System.out.println("May be had any exception");
        return -99;
     }
	finally {
        System.out.println("Will Execute always");
     } 
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(alwaysExecute());
	}

}
