import java.util.Scanner;
class Perfect 
{
    public static boolean isPerfect(int n)
    {
        int sum=0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        if(sum==n)
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num =sc.nextInt();
        if(isPerfect(num))
            System.out.println(num+" is Perfect");
        else
            System.out.println(num+" is not Perfect");
    }
}
