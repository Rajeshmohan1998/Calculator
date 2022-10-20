import java.util.*;
public class CalculatorMain {
	
	public void display()
	{
		System.out.println("1.Addition\n2.Subtraction\n3.Division\n4.Multiplication ");
	}
	
	public static void main(String args[])
	{
		CalculatorMain obj = new CalculatorMain();
		obj.display();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please choose the operation :");
		int choice = sc.nextInt();
		System.out.println("Please enter the value 1");
		int num1 = sc.nextInt();
		System.out.println("Please enter the value 2");
		int num2 = sc.nextInt();
		//switch case
		
		switch(choice)
		{
			case 1:
			case 2:
			case 3:
			case 4:
			default:
				System.out.println("invalid choice");	
		}
		
	}

}
