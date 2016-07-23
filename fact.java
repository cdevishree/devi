class factorial{
public static void main(String[] args){
int fact=1;
int n=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter the value:");
int n=s.nextInt();
for(int i=0;i<=n;i++)
{
fact=fact*i;
}
}
}
