import java.util.Scanner;
class fibonacci2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number:");
        int l = sc.nextInt();
        int u = sc.nextInt();
        int a=0,b=1,c;
        while(a<=u)
        {
            if(a>=l)
                System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}
