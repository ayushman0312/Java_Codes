public class reverseString 
{
    public static void main(String[] args) 
    {
        String s1="java";
        char[] a=s1.toCharArray();
        String s2="";
        for(int i=a.length-1;i>=0;i--)
        {
            s2+=a[i];
        }
        System.out.println("Reverse = "+s2);  
    }    
}
