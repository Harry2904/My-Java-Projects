import java.io.*;
class SmallestNumber
{
    public static void main(String[] args)throws IOException
    {
       BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
       int N=Integer.parseInt(input.readLine()),smallest= 2147483647,i;
       int arr[]=new int[N];
       String b[]=(input.readLine()).split(" ");
       for(i=0;i<N;i++)
       {
           arr[i]=Integer.parseInt(b[i]);
       }
       for(i=0;i<N;i++)
       {
           if(arr[i]<=smallest)
           {
               smallest=arr[i];
           }
       }
       System.out.println("The smallest number is "+smallest);
    }
}