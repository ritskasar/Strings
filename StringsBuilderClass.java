import java.util.*;
class StringsBuilderClass
{
	public static void main(String[]args)
	{
		StringBuilder in = new StringBuilder("HELLO");
		System.out.println(in);

        // length of string...
		System.out.println("Length of string = " +in.length());

		// charAt() method
		System.out.println(in.charAt(4));

		//setCharAt() method
		in.setCharAt(0,'C');
		System.out.println(in);

		// insert() method
		System.out.println(in.insert(5,'W'));

		// delete() method
		System.out.println(in.delete(5,'W'));

		//append() method
		in.append("A");
		System.out.println(in);

	}
}