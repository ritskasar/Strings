import java.util.*;
class StrMail
{
	public static void main(String []args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the mail address");
		String s=in.nextLine();
		     int a=s.indexOf('@');
		    int b=s.indexOf('.');
        String t=s.substring(0,a);
        System.out.println("user="+t);
        String x=s.substring(a+1,b);
        System.out.println("Domain="+x);
        String y=s.substring(b+1,b+4);
        System.out.println("Type="+y);
	}
}