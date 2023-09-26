import java.util.Scanner;
class Amstrong 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int count=0;
        int sum=0;
        int numcpy=n;
        while(n>0)
        {
            count++;
            n/=10;
        }
        System.out.println("Count = "+count);
        n=numcpy;
        while(n>0)
        {
            int r=n%10;
            int prod=1;
            for(int i=1;i<=count;i++)
            {
                prod*=r;
            }
            sum+=prod;
            n/=10;
        }
        System.out.println("Sum = "+sum);
        if(sum==numcpy)
        {
            System.out.println("Amstrong Number");
        }
        else
        {
            System.out.println("Not Amstrong Number");
        }
    }   
}
