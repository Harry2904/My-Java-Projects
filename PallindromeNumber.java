import java.io.*;
class PallindromeNumber
{
    public static void main(String[] args)throws IOException
    {
       BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
       int N=Integer.parseInt(input.readLine()),rev=0,dig;
       int no=N;
       for(int i=0;i<N;i++)
       {
           while(no>0)
           {
               dig=no%10;
               rev=(rev*10)+dig;
               no=no/10;
           }
       }
       if(rev==N)
       {
           System.out.println("Pallindrome");
       }
       else
       {
           System.out.println("Not Pallindrome");
       }
    }
}