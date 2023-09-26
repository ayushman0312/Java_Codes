import java.util.Scanner;
class Singledigitsum 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find the sum:");
        int n = sc.nextInt();
        int sum=0;
        do
        {
            sum=0;
            while(n>0)
            {
                sum += (n%10);
                n/=10;
            }
            n=sum;
        }while(sum>9);
        System.out.println("Sum of digits = "+sum);
    }
}
