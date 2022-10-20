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
		double num1 = sc.nextInt();
		System.out.println("Please enter the value 2");
		double num2 = sc.nextInt();
		
		CalculatorAddSub obj2 = new CalculatorAddSub();
		
		//switch case
		switch(choice)
		{
			case 1:
				obj2.add(num1, num2);
				break;
			case 2:
				obj2.sub(num1, num2);
				break;
		/*	case 3:
			case 4:
			*/
			default:
				System.out.println("invalid choice");	
		}
		
	}

}
