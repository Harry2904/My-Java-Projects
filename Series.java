import java.io.*;
class Series
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(input.readLine());
        int i;
        for(i=1;i<=N;i++)
        {
            if(i==N)
            {
                System.out.print(i*i);
            }
            else
            {
                System.out.print(i*i+",");
            }
        }
    }
}