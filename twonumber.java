import java.util.Scanner;
public class twonumber
{
    public static void main(String[] args) {
        Scanner user=new Scanner(System.in);
        System.out.println("Enter the number1:");
        int num1=user.nextInt();
        System.out.println("Enter the number2");
        int num2=user.nextInt();
        //working with control statements.
        if(num1>num2)
        {
            System.out.println("number one is biggest!");
        }else
        {
            System.out.println("number two is biggest!");
        }

    }
}
