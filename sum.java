//Sum of N numbers
import java.util.Scanner;
class sum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find the sum:");
		int n = sc.nextInt();
		int sum=0;
		String s="";
		for(int i=1;i<=n;i++)
		{
			sum += i;
			s = s+i;
			if(i<n)
			{
				s = s+"+";
			}
		}
		System.out.println("Sum of 1 to "+n+"="+sum);
		System.out.println(s+"="+sum);

	}
}
