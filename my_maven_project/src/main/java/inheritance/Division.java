package inheritance;

public class Division extends Substraction{
	
	public void divide()
	{
		float divison = number1/number2;
		System.out.println("Divison :"+ divison);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Division div = new Division();
		System.out.println("Numbers are :"+div.number1+" "+div.number2);
		div.add();
		div.substract();
		div.divide();
		

	}

}
