import java.io.*;
public class SpecialNumber
{
  public static void main(String[] args)throws IOException
  {
     BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
     String s=input.readLine();
     int N=Integer.parseInt(s),i,fact,dig,no,sum=0;
     no=N;
     while(N > 0)
     {
         dig=N%10;
         fact=1;
         for(i=0;i<=dig;i++)
         {
             fact=fact*i;
         }
         sum=sum+fact;
         N=N/10;
     }
     if(sum==no)
     {
         System.out.println(no+" is a Special Number");
     }
     else
     {
         System.out.println(no+" is not a Special Number");
     }
  } 
}
