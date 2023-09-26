import java.util.Scanner;
class RangeStrong
{
    public static void main(String[] args)
    {
    Scanner scn = new Scanner (System.in);
    System.out.print("Enter Start : ");
    int start = scn.nextInt();
    System.out.print("Enter End : ");
    int end = scn.nextInt();
    for(int i=start;i<=end;i++)
    {
        int num = i;
        int sum = 0;
        while(num>0)
        {
            int r = num%10;
            int fact=1;
            for(int j=1;j<=r;j++)
            {
                fact*=j;
            }
            sum+=fact;
            num/=10;
        }
        if(sum==i)
        {
            System.out.println(i);
        }
    }
    }
}
