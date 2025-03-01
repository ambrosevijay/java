import java.util.Scanner;
public class twonumber
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number1:");
        int num1=input.nextInt();
        System.out.println("Enter the number2");
        int num2=input.nextInt();
        //working with control statements if.
        if(num1>num2)
        {
            System.out.println("number one is biggest!");
        }else
        {
            System.out.println("number two is biggest!");
        }

    }
}
