import java.util.Scanner;
class Armstrong
{
    public static boolean isArmstrong(int n)
    {
        int temp=n,sum=0,count=0;
        while(n>0)
        {
            count++;
            n/=10;
        }
        n=temp;
        while(n>0)
        {
            int rem=n%10;
            int prod=1;
            for(int i=1;i<=count;i++)
            {
                prod*=rem;
            }
            sum+=prod;
            n/=10;
        }
        if(temp==sum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        if(isArmstrong(num))
        {
            System.out.println(num+" is Armstrong Number");
        }
        else
        {
            System.out.println(num+" is not Armstrong Number");
        }
    }
}