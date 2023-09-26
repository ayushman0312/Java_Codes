import java.util.Scanner;
class power 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number and power: ");
        int n = sc.nextInt();
        int pow = sc.nextInt();
        int result=1;
        for(int i=1;i<=pow;i++)
        {
            result *= n;
        }
        System.out.println("Result = "+result);
    }
}
