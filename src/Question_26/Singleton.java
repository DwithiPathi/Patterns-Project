package Question_26;

public class Singleton {
	private static Singleton sSoleInstance;
    private Singleton(){}  
	public static Singleton getInstance(){
        if (sSoleInstance == null){ //if there is no instance available... create new one
            sSoleInstance = new Singleton();
        }
        return sSoleInstance;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instance 1
        Singleton instance1 = Singleton.getInstance();

        //Instance 2
        Singleton instance2 = Singleton.getInstance();

        //now lets check the hash key.
        System.out.println("Instance 1 hash:" + instance1.hashCode());
        System.out.println("Instance 2 hash:" + instance2.hashCode());
	}

}
