package inheritance;

public class Child extends Parent{
	
	public void display()
	{
		System.out.println("Child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child chd = new Child();
		chd.display();
		chd.add();
		System.out.println("Number 1 in parent class" +chd.num1);
		System.out.println("Number 2 in parent class" +chd.num2);
		

	}

}
