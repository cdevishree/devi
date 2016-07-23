public class Strrev {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the string:");
	String name=s.next();
	StringBuffer sb=new StringBuffer(name);
	sb=sb.reverse();
	String str=new String(sb);
	System.out.println("reversed string is:"+str);
	s.close();
	
}
}
