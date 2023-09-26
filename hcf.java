import java.util.Scanner;
class hcf 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter 2 numbers:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int s = n1<n2?n1:n2;
        int i;
        for(i=s;i>0;i--)
        {
            if(n1%i==0 && n2%i==0)
            {
                System.out.println("HCF = "+i);
                break;
            }
        }
    }
}
