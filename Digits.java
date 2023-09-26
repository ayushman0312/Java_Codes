import java.util.Scanner;
class Digits
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a no");
		int n=scn.nextInt();
		int evensum=0;
		int oddsum=0;
		while(n>0)
		{
			int d=n%10;
			if(d%2==0)
				evensum+=d;
			else
				oddsum+=d;
			n/=10;
		}
		System.out.println(evensum);
		System.out.println(oddsum);
	}
}
