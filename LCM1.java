import java.util.Scanner;
class LCM1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int i= a>b?a:b;
		while(true)
		{
			if(i%a==0 && i%b==0)
				break;
			i+=i;
		}
		System.out.println("LCM ="+i);
	}
}
