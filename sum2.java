class sum2 
{
    public static void main(String[] args) {
        int num=1234,sum=0;String s="";
        while(num>0)
        {
            int rem = num%10;
            sum+=rem;
           if s=s + "+" + rem;
            num/=10;
        }
         System.out.println(s+ "=" + sum);
    }
    
}
