import java.util.Scanner;
class misc1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int rev=0;
        int temp=n;
        int count=0;
        while(temp!=0)
        {
            count++;
            temp/=10;
        }
        System.out.println("Count = "+count);
        while(n>0)
        {
            int r = n%10;
            rev = rev*10+r;
            n/=10;
        }
        System.out.println("Reverse = "+rev);
        System.out.println("Enter the number to sum:");
        int key = sc.nextInt();
        int sum=0;
        int diff=count-key;
        int mul=1,d=0;
        for(int i=1;i<=diff;i++)
        {
            mul*=10;
            d=rev/mul;
        }
        System.out.println("Last digits = "+d);
        while(d>0)
        {
            sum+=(d%10);
            d/=10;
        }
        System.out.println("Sum ="+sum);
    }
}
