public class Numrev {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=s.nextInt();
		while(num>0){
			int b=num%10;
			System.out.print(b);
			num/=10;
	
		}
		s.close();
	}
}
