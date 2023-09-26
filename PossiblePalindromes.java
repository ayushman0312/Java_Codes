class PossiblePalindromes 
{
    public static void main(String[] args) 
    {
        String s1="malayalam";
        for(int i=0;i<s1.length();i++)
        {
            for(int j=i+1;j<s1.length();j++)
            {
                if(isPal(s1,i,j))
                {
                    System.out.println(s1.substring(i,j+1));
                }
            }       
        }
    }

    public static boolean isPal(String s,int start,int end)
    {
        char[] a=s.toCharArray();
        int i=start;
        int j=end;
        while(i<j)
        {
            if(a[i]!=a[j])
                return false;
            i++;
            j--;
        }
        return true;
    }
   
}
