import java.util.*;
public class BunniesEars {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Bunnies:");
		int n=sc.nextInt();
		System.out.println("Total Ears of "+n+" Bunnies is:"+(totalEarsOfBunnies(n)));
		
	}
	static int totalEarsOfBunnies(int n )

	{
	if(n==0)
		return 0;
	else if (n==1)
		return 2;
	else 
	{
	return	totalEarsOfBunnies(n-1)+2;
	}
	}

}
