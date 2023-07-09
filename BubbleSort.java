import java.io.*;
class BubbleSort
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(input.readLine());
        int arr[]=new int[N],i,j,temp;
        String b[]=(input.readLine()).split(" ");
        for(i=0;i<N;i++)
        {
            arr[i]=Integer.parseInt(b[i]);
        }
        for(i=0;i<N-1;i++)
        {
            for(j=0;j<N-1-i;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(i=0;i<N;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}