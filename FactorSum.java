import java.io.*;
class FactorSum
{
    public static void main(String[] args)throws IOException
    {
       BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
       int N=Integer.parseInt(input.readLine()),sum=0;
       for(int i=1;i<N;i++)
       {
           if(N%i==0)
           {
               sum=sum+i;
           }
       }
       System.out.println(sum);
       if(sum==N)
       {
           System.out.println(N+" is a perfect number");
       }
       else
       {
           System.out.println(N+" is not a perfect number");
       } 
    }
}