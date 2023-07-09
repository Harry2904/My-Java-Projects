import java.io.*;
class SummationNumber
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(input.readLine()),sum=0,dig;
        for(int i=0;i<N;i++)
        {
            while(N>0)
            {
                dig= N%10;
                sum=sum+dig;
                N=N/10;
            }
        }
        System.out.println(sum);
    }
}