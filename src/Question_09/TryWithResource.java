package Question_09;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResource { 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we created resources in try block
	      try(FileInputStream input = new FileInputStream(new File("Sample1.txt"));
	    	      FileOutputStream output = new FileOutputStream(new File("Duplicate.txt"))){
	    	         byte[] buffer = new byte[1024];
	    	         int length;
	    	         while ((length = input.read(buffer)) > 0) {
	    	            output.write(buffer, 0, length);
	    	         }
	    	         System.out.println("File successfully copied");
	    	      }
	    	      catch(IOException e) {
	    	         e.printStackTrace();
	    	      }

	}

}
