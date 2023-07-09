import java.io.*;
public class Pattern2
{
    public static void main(String[] args)throws IOException
    {
       BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
       int N=Integer.parseInt(input.readLine()),i,j;
       for(i=1;i<=N;i++)
       {
           for(j=i;j>=1;j--)
           {
               System.out.print(j+" ");
           }
        System.out.println(" ");
       }
    }
}