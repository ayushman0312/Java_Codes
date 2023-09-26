import java.util.Scanner;
class LCM 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n=1;
		while(true)
		{
			if(n%a==0 && n%b==0)
				break;
			n++;
		}
		System.out.println("LCM ="+n);
	}
}
