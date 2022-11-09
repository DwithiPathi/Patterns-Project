package Question_03;

public class CovariantB extends CovariantA{
	@Override
	CovariantB Show(){
	CovariantA covariantA = new CovariantA();
	covariantA.Show();
	System.out.println("not show");
	return this;
	} 
	}

