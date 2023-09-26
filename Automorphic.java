import java.util.Scanner;
class Automorphic
{
    public static boolean isAutomorphic(int n)
    {
        int temp=n,count=0;
        while(temp>0)
        {
            count++;
            temp/=10;
        }
        int prod=1;
        for(int i=1;i<=2;i++)
        {
            prod*=n;
        }
        int j=1;
        for(int k=1;k<=count;k++)
        {
            j*=10;
        }
        int r1=n%j;
        int r2=prod%j;
        if(r1==r2)
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
        if(isAutomorphic(num))
            System.out.println(num+" is Automorphic");
        else
            System.out.println(num+" is not Automorphic");
    }
}
