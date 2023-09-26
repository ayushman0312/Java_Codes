import java.util.Scanner;
class binTodec 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter binary number: ");
        int n = sc.nextInt();
        int dec=0;
        int i=1;
        while(n>0)
        {
            int r = n%10;
            dec += r*i;
            i*=2;
            n/=10;
        }
        System.out.println("Decimal equivalent Binary Number is "+dec);
    }
}