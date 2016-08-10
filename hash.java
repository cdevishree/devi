import java.util.Scanner;


public class Hash {

	public static void main(String[] args) {

	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size :");
	int n=s.nextInt();
		String hash="";
		for(int i=1;i<=n;i++){
			hash+="#";
			System.out.print(" "+hash+" ");
			
		}
	}

}
