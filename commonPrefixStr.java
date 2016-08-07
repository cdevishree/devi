package lesum;

import java.util.Scanner;

public class Prefix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first string: ");
	String str1 = sc.nextLine();

	System.out.println("Enter the second string: ");
	String str2 = sc.nextLine();

	if (str1.charAt(0) != str2.charAt(0)) {
	  System.out.println(""+str1+ " and "+str2+ " have no common prefix");
	  System.exit(0);
	    }

	for(int i=0;i<str1.length();i++){
		if(str1.charAt(i)==str2.charAt(i)){
			System.out.print(str1.charAt(i));
		}
	}
	sc.close();
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
