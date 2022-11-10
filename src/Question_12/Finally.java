package Question_12;

public class Finally {

	public static void main(String[] args) {
		 try {    
		       System.out.println("try block");   
		       int data=25/0;    
		       System.out.println(data);    
		      }    
		      catch (ArithmeticException e){  
		        System.out.println("Exception is handled");  
		        System.out.println(e);  
		      }     
		      finally {  
		        System.out.println("finally block is always executed");  
		      }    
		      System.out.println("code");    
		      }    
		    }    