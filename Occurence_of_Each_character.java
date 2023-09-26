class Occurence_of_Each_character 
{
    public static void main(String[] args) {
        String s1="banana";
        //int i=0;
        while(s1.length()>0)
        {
            //if(i==s1.length())
            //    break;
            char ch=s1.charAt(0);
            String s2=s1.replace(ch+"", "");
            int count=s1.length()-s2.length();
            System.out.println(ch+"="+count);
            s1=s2;
            //i++;
        }
        
    }
}
