package lesum;

import java.util.Scanner;

public class Prefix {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	System.out.println("Enter the first string: ");
	String s = input.nextLine();

	System.out.println("Enter the second string: ");
	String s1= input.nextLine();

	if (s.charAt(0) != s1.charAt(0)) {
	  System.out.println(""+s+ " and "+s1+ " have no common prefix");
	  System.exit(0);
	    }

	for(int i=0;i<s.length();i++){
		if(s.charAt(i)==s1.charAt(i)){
			System.out.print(s.charAt(i));
		}
	}
	input.close();
	}
	}
