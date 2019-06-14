import java.util.*;
public class MultiplicationOfNaturalNumbers {
	public static void main(String[] args) {
		int b,a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers for multiplication:");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Your result of "+a+"*"+b+"="+(multplication(b,a)));
		
	}
	 static int  multplication(int n,int a)
	 {
		 if (n==0||a==0)
			 return 0;
	     else  if(n==1)
			 return a;
		 else 
			 return a+multplication(n-1,a);
	 }
}
