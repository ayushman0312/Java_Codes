class SumOfDigits 
{
    public static void main(String[] args) 
    {
        String s1="a13b2cd1ef2";
        char[] a=s1.toCharArray();
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>='0' && a[i]<='9')
            {
                sum+=a[i]-'0';
            }
        }
        System.out.println("Sum of Digits = "+sum);    
    }    
}
