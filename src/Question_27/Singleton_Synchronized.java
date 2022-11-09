package Question_27;



public class Singleton_Synchronized {
	private static Singleton_Synchronized instance;
	  private Singleton_Synchronized(){}
	 
	 //synchronized method to control simultaneous access
	  synchronized public static Singleton_Synchronized getInstance()
	  {
	    if (instance == null) 
	    {
	      // if instance is null, initialize
	      instance = new Singleton_Synchronized();
	    }
	    return instance;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instance 1
		Singleton_Synchronized instance1 = Singleton_Synchronized.getInstance();

        //Instance 2
		Singleton_Synchronized instance2 = Singleton_Synchronized.getInstance();

        //now lets check the hash key.
        System.out.println("Instance 1 hash:" + instance1.hashCode());
        System.out.println("Instance 2 hash:" + instance2.hashCode());
	}

	}


