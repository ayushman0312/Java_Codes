import java.util.Scanner;
class sum1
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a no");
		int n=scn.nextInt();
		int sum=0;
		while(n>0)
		{
			int d=n%10;
			sum+=d;
			n/=10;
		}
		System.out.println(sum);
	}
}
