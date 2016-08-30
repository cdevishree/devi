import java.util.Scanner;


public class Sum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int count=0;
		while(n!=0){
			int a=n%10;
			n/=10;
			count++;
		}
		System.out.println(count);
		s.close();
}
}
