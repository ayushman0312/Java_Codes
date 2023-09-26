import java.util.Scanner;
class Strong
{
    public static void main(String[] args)
    {
    Scanner scn = new Scanner (System.in);
    System.out.print("Enter a number: ");
    int n=scn.nextInt();
    int numcpy=n;
    int sum=0;
    while(n>0)
    {
        int r=(n%10);
        int fact=1;
        for(int i=1;i<=r;i++){
            fact*=i;
        }
        sum+=fact;
        n/=10;
    }
    System.out.println("sum="+sum);
    if(sum==numcpy)
        System.out.println(numcpy +" is a Strong number");
    else
        System.out.println(numcpy +" is not strong");
    }

}
