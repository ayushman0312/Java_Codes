public class countVowels
{
    public static void main(String[] args) 
    {
        String s1="javadeveloper";
        int count=0;
        char[] a=s1.toLowerCase().toCharArray();
        char[] v={'a','e','i','o','u'};
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<v.length;j++)
            {
                if(a[i]==v[j])
                {
                    count++;
                }
            }
        }
        System.out.println("No Of Vowels = "+count);
    }    
}
