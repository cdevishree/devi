
public class Multiple {
	public static int output;
	
public static void multiple(int num){
	int t=num;
	int len=String.valueOf(t).length();
	
	while(num>0)
	{
		int a=num%10;
		t*=a;
		num=num/10;
	}
	output=t;
}
	
	public static void main(String[] args) {

		multiple(123);
		System.out.println(output);
		
	}

}
