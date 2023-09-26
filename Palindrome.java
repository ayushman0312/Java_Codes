class Palindrome
{
    public static void main(String[] args) 
    {
        String s1="tenet";
        System.out.println("String = "+s1);
        if(isPal(s1))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
    public static boolean isPal(String s)
    {
        char[] a=s.toCharArray();
        int i=0,j=a.length-1;
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