package nums;

public class Strencryption {
	public static void main(String[] args) {
		String str="Bcda";
		int length=str.length();
		char[] ch=new char[length];
		int[] flag=new int[length];
		for(int i=0;i<length;i++){
			ch[i]=str.charAt(i);
			if(ch[i]>=65 && ch[i]<=90){
				flag[i]=1;
			}
		}
		char key='\0';
		for(int i=length-1;i>=0;i--){
			if((ch[i]>=65 && ch[i]<=90)||(ch[i]>=95 && ch[i]<=122)){
				key=ch[i];
				break;
			}
		}
		int keyval=key-96;
		for(int i=0;i<length;i++){
			if((ch[i]>=65 && ch[i]<=90)||(ch[i]>=95 && ch[i]<=122)){
				char c=Character.toLowerCase(ch[i]);
				ch[i]=(char)(c-keyval);
				if(ch[i]>=123){
					ch[i]=(char)(ch[i]-26);
					if(flag[i]==1){
						ch[i]=(char)(ch[i]-32);
					}}
				System.out.println(ch[i]);
					}
				}
			}
		
}
