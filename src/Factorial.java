import java.util.*;
public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		System.out.println("Your factorial of "+a+" is :"+(recursion(a)));
	}
	static int recursion(int n)
	{
		if(n==0)
			return 1;
		else if(n==1)
			return 1;
		else 
			return n*recursion(n-1);
		
	}

}
