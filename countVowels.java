import java.util.*;
class countVowels
{
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any string..");
		String str = in.nextLine();
		int c=0;

		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);

			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			c++;
		}

		System.out.println("Vowels is string = " +c);
	}
}