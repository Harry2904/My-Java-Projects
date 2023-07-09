import java.io.*;
class BinarySearching
{
    public static void main(String[] args)throws IOException
    {
      BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
      int N=Integer.parseInt(input.readLine()),i,j,temp;
      String b[]=(input.readLine()).split(" ");  
      int arr[]= new int[N];
      for(i=0;i<N;i++)
      {
          arr[i]=Integer.parseInt(b[i]);
      }
      for(i=0;i<N-1;i++)
      {
          for(j=0;j<N-1-i;j++)
          {
              if( arr[j] > arr[j+1])
              {
                  temp= arr[j];
                  arr[j]= arr[j+1];
                  arr[j+1]= temp;
              }
          }
      }
      for(i=0;i<N;i++)
      {
          System.out.print(arr[i]+" ");
      }
      System.out.println();
      System.out.println("Enter the number you want to search");
      int beg,mid,end,num=Integer.parseInt(input.readLine()),k=0,flag=0;
      beg=0;
      end=N-1;
      while (beg <= end)
      {
          mid=(beg+end)/2;
          if(num==arr[mid])
          {
              flag=1;
              k=mid;
              break;
          }
          else if(num < arr[mid])
          {
              end= mid-1;
          }
          else if(num > arr[mid])
          {
              beg= mid+1;
          }
      }
      if(flag==0)
      {
          System.out.println("Not found");
      }
      else
      {
          System.out.println("Number found at index "+k);
      }
    }
}