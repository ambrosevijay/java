

import java.util.Scanner;

public class BiggestofThreenumbers {

	public static void main(String[] args) {
		// find maximum numbers of three
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number1:");
		int num1=input.nextInt();
		System.out.println("Enter the number2:");
		int num2=input.nextInt();
		System.out.println("Enter the number3:");
		int num3=input.nextInt();
		if(num1>num2 && num1>num3)
		{
			System.out.println("number one is maximum:"+num1);
		}else if(num2>num1 && num2>num3)
		{
			System.out.println("number two is maximum:"+num2);
		}else if(num3>num1 && num3>num2)
		{
			System.out.println("number three is maximum:"+num3);
		}else
		{
			System.out.println("boths are same:"+num1+num2+num3);
		}

	}

}
