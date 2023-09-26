import java.util.Scanner;
class Niven 
{
    public static boolean isNiven(int n)
    {
        int temp=n,sum=0;
        while(n>0)
        {
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        if((temp%sum)==0)
            return true;
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num =sc.nextInt();
        if(isNiven(num))
            System.out.println(num+" is Niven number");
        else
            System.out.println(num+" is not a Niven number");
    }   
}
