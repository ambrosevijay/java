//find alphbet or not

import java.util.Scanner;

public class AlphabetorNot {

	public static void main(String[] args) {
		// find alphabets or not
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the values:");
		char ch=in.next().charAt(0);
		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
		{
			System.out.println("Alphabets here!");
		}else
		{
			System.out.println("oops,this not Alphabets!");
		}

	}

}
