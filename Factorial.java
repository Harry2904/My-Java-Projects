import java.io.*;
class Factorial
{
    public static void main(String[] args)throws IOException
    {
       BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter the Number");
       int N=Integer.parseInt(input.readLine()),fact=1,i;
       for(i=1;i<=N;i++)
       if(N<0)
       {
           System.out.println("Factorial not possible");
       }
       else if(N==0)
       {
           System.out.println("Factorial of Zero is 1");
       }       
       else
       {
           fact=fact*i;
       }
       System.out.println("Factorial of "+N+" is "+fact);
    }
}