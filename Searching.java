import java.io.*;
class Searching
{
    public static void main(String[] args)throws IOException
    {
       BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
       int N= Integer.parseInt(input.readLine());
       int arr[]=new int[N],i,j,temp,flag=0;
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
       System.out.println();
       System.out.println("Enter the number you want to search");
       int num=Integer.parseInt(input.readLine()),k;
       for(k=0;k<N;k++)
       {
           if(arr[k]==num)
           {
               flag=1;
               break;
           }
       }
       if(flag==0)
       {
           System.out.println("Number not found");
       }
       else
       {
           System.out.println("Number has been found at index "+k);
       }
    }
}