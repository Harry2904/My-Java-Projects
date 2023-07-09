import java.io.*;
class Pattern
{
    public static void main(String[] args)throws IOException
    {
       BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
       int N=Integer.parseInt(input.readLine()),i,j;
       for(i=1;i<=N;i++)
       {
           for(j=1;j<=i;j++)
           {
               System.out.print(j+" ");
           }
        System.out.println(" ");
       }
    }
}