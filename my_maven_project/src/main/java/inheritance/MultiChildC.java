package inheritance;

public class MultiChildC extends MultiChildB{
	
	public void displayC()
	{
		System.out.println("Child C");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiChildC obj = new MultiChildC();
		obj.displayA();
		obj.displayB();
		obj.displayC();
		System.out.println("Number is Parent A"+obj.num);
		System.out.println("Done");

	}

}
