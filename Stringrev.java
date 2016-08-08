import java.util.Scanner;


public class Stringrev {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String input=sc.next();
		StringBuffer sb=new StringBuffer(input);
		sb=sb.reverse();
		StringBuffer sb1=new StringBuffer();
		String s=new String(sb);
		
		System.out.println("The reversed string is : "+s);
	}

}
