public class StringPrimeDigitsSum 
{
    public static void main(String[] args) 
    {
        String s1="ab12cd3yuu5c6c";
        int sum=0;
        char[] ch=s1.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]>='0' && ch[i]<='9')
            {
                int num=ch[i]-'0';
                if(isPrime(num))
                {
                    sum+=num;
                }
            }
        }
        System.out.println("Sum = "+sum);
    }
    public static boolean isPrime(int n)
    {
        if(n<=1)
            return false;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }    
}
