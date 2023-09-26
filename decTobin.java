import java.util.Scanner;
class decTobin 
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a decimal number:");
    int num=sc.nextInt();
    int bin=0;
    int i=1;
    while(num>0)
    {
        int r = num%2;
        bin +=r*i;
        i*=10;
        num/=2;
    }
    System.out.println("Binary equivalent is :"+ bin);
    }
}
