import java.io.*;
class RevArr
{
    public static void main(String[] args)throws IOException
    {
       BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
       int N=Integer.parseInt(input.readLine());
       int arr[]= new int[N];
       String b[]=(input.readLine()).split(" ");
       for(int i=0;i<N;i++)
       {
           arr[i]=Integer.parseInt(b[i]);
       }
       int start,end,temp;
       start= 0;
       end= N-1;
       while(start < end)
       {
           temp= arr[start];
           arr[start]=arr[end];
           arr[end]=temp;
           start++;
           end--;
       }
       System.out.println("The Reverse of Array is:");
       for(int j=0;j<N;j++)
       {   
        System.out.print(arr[j]+" ");
       } 
    }
}