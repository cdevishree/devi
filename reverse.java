import java.util.Scanner;


public class Reverse {

	
	public static void main(String[] args)
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the num :");
		int a=s.nextInt();
		//int length=String.valueOf(a.length()); 
		while(a!=0)
		{
			 int n=a%10;
			 System.out.print(n);
			a=a/10;
			
		}
		
		
		
	}

}
