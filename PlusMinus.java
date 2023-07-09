import java.io.*;

public class PlusMinus
{
    public static void main(String[] args)throws IOException
    {
       BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
       int N=Integer.parseInt(input.readLine());
       int arr[]= new int[N],len,pcount=0,ncount=0,zcount=0;
       String b[]=(input.readLine()).split(" ");
       len=arr.length;
       for(int i=0;i<len;i++)
       {
           arr[i]=Integer.parseInt(b[i]);
           if(arr[i]<0)
           {
               ncount++;
           }
           else if(arr[i]==0)
           {
               zcount++;
           }
           else
           {
               pcount++;
           }
       }
       System.out.println(String.format("%.6f",(pcount*1.0/N)));
       System.out.println(String.format("%.6f",(ncount*1.0/N)));
       System.out.println(String.format("%.6f",(zcount*1.0/N)));
    }
}