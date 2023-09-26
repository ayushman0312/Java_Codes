import java.util.Scanner;
class Magic 
{
    public static boolean isMagic(int n)
    {
        int sum=0,temp=n;
        while(n>0)
        {
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        int rev=0;
        int s=sum;
        while(sum>0)
        {
            int digit=(sum)%10;
            rev=rev*10+digit;
            sum/=10;
        }
        int prod=rev*s;
        if(prod==temp)
        {
            return true;
        }
        return false;   
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        if(isMagic(num))
        {
            System.out.println(num+" is Magic number");
        }
        else
            System.out.println(num+" is not Magic number");
    }    
}
