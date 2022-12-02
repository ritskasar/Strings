import java.util.*;
class MethodsStrings
{
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);

		System.out.println("Enter your name...");
		String Name = in.nextLine();               //Declaration of string-1
		System.out.println("Enter your Gmail-ID");
		String ID = in.nextLine();                //Declaration of string-2

		System.out.println();

		String Info = Name +"  " +ID;             //Concatination of string...
		System.out.println(Info);

		System.out.println();

		//length of String....
		System.out.println("Length of given Information...." +Info.length());

		System.out.println();

		//charAt() Method

		//char s = Info.charAt(8);
		System.out.println("Enter any index number ...");
		int i=in.nextInt();
		System.out.println(Info.charAt(i));

		System.out.println();

		//indexOf Method
		System.out.println("Enter any character for find index ....");
		String ch = in.next();
		System.out.println(Info.indexOf(ch));

		System.out.println();

		//endWith() Method

		if(ID.endsWith("gmail.com")){
			System.out.println("Given account is Gmail Account...");
		}else{
			System.out.println("Not a gmail account..");
		}


	}
}