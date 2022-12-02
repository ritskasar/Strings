import java.util.*;
class equalStrings
{
	public static void main(String[]args)
	{
		Scanner in  = new Scanner(System.in);

		System.out.println("Enter any two string..");
		String str1 = in.nextLine();               //Declaration of string-1
		String str2 = in.nextLine();                //Declaration of string-2

		System.out.println();

		// equals() method

		if(str1.equals(str2))
		{
			System.out.println("Both Strings are equal..");
		}else{
			System.out.println("Strings are not equal..");
		}
	}
}