import java.util.*;
class StrEqual
{
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter any two String ");
		String s1=in.nextLine();
		String s2=in.nextLine();

		int i,c=0;

		if(s1.length()==s2.length())
		{
			for(i=0;i<s1.length();i++)
			{
				char ch1=s1.charAt(i);
				char ch2=s2.charAt(i);
              {
                if( ch1 == ch2)
                  c++;
			  }
		    }

		    if(c==s1.length())
		    {
		    System.out.println("Both strings are equal");
		    System.out.println(s1 +" = " +s2);
		    }
		    else
		    System.out.println("Both strings are not equal");
		}
		else
		System.out.println("Both strings are not equal");
	}
}
