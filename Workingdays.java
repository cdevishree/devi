import java.util.Scanner;


public class Workingdays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the day :");
		String day=sc.next();
		if(day=="monday"||day=="Thuesday"||day=="wednesday"||day=="Thursday"||day=="friday"){
			System.out.println("Working day");
		}
		else
		{
			System.out.println("Holiday");
		}
		sc.close();
	}

}
