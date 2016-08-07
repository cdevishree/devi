package lesum;

public class Uniquenum {

	public static void main(String[] args) {
		int []a=new int[]{1,2,3,2,4,1,4};
		int count=1;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					count++;
				}
			}
			if(count==1){
				System.out.println("the number is :"+a[i]);
			}
		}
	}
}
