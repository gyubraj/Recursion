import java.util.*;

public class Fibonacci {
	static int i;
	public static void main(String[] args)
	{
	int f2;
	System.out.println("Enter the position of Fibonacci position u want to find:");
	Scanner sc=new Scanner(System.in);
	int i=sc.nextInt();
	f2=recursive(i);
	System.out.println("Your needed Fibonacci number is:"+f2);
	}
	static int  recursive(int n)
	{
	if (n==0)
		return 0;
	else if(n==1)
		return 1;
	else 
		return(recursive(n-1)+recursive(n-2));
		
	}
}
