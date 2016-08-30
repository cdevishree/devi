import java.util.Scanner;


public class Sum {

	public static void main(String[] args) {
		int sum=0;
		int arr[]=new int[]{3,4,5,7,8,3,5,6};
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		System.out.println("the sum of values is : "+sum);
	}
}
