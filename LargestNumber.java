import java.io.*;
public class LargestNumber
{
    public static void main(String[] args)throws IOException
    {
       BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
       int N=Integer.parseInt(input.readLine()),largest= -2147483648,i;
       int arr[]=new int[N];
       String b[]= (input.readLine()).split(" ");
       for(i=0;i<N;i++)
       {
           arr[i]=Integer.parseInt(b[i]);
       }
       for(i=0;i<N;i++)
       {
       if(arr[i] >= largest)
       {
           largest=arr[i];
       }
    }
       System.out.println("The largest number is "+largest);
    }
}