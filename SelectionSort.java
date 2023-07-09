import java.io.*;
public class SelectionSort
{
    public static void main(String[] args)throws IOException
    {
       BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
       int N=Integer.parseInt(input.readLine()),i,j;
       int arr[]=new int[N],temp;
       String b[]=(input.readLine()).split(" ");
       for(i=0;i<N;i++)
       {
           arr[i]=Integer.parseInt(b[i]);
       }
       for(i=0;i<N-1;i++)
       {
        for(j=i+1;j<N;j++)
        {
            if(arr[i] > arr[j])
            {
                temp= arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
            }
        }
    } 
    for(j=0;j<N;j++)
    {
        System.out.print(arr[j]+" ");
    }
       }
}