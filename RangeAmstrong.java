import java.util.Scanner;
class RangeAmstrong 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int s = sc.nextInt();
        int e = sc.nextInt();
        for(int j=s;j<=e;j++)
        {
            int count=0;
            int sum=0;
            int numcpy=j;
            while(j>0)
            {
                count++;
                j/=10;
            }
            j=numcpy;
            while(numcpy>0)
            {
                int r=numcpy%10;
                int prod=1;
                for(int i=1;i<=count;i++)
                {
                    prod*=r;
                }
                sum+=prod;
                numcpy/=10;
            }
            if(sum==j)
            {
                System.out.println(j);
            }
        }
    }   
}
