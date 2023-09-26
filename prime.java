class prime 
{
    public static void main(String[] args)
    {
        int n=7;
        if(n<=1)
        {
            System.out.println("Not Prime");
            return;
        }    
        boolean flag = true;
        for(int i=2;i<=n/2;i++)
        {
            if (n%i==0)
            {
                flag=false;
            }
        }
        if(flag)
            System.out.println("Prime"); 
        else
            System.out.println("Not Prime"); 
       
    }
}
