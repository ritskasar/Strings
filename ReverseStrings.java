import java.util.*;
class ReverseStrings
{
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);

		System.out.println("Enter any Strings");
		String str = in.nextLine();

		String rev =" ";

		System.out.println(str.length());

		for(int i=str.length()-1;i>=0;i--)
		{
			char ch = str.charAt(i);
			rev = rev+ch;
		}

		System.out.println("Reverse of given string = " +rev);
	}
}