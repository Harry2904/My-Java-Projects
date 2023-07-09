import java.io.*;
class ProductNumber
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(input.readLine()),product=1,dig;
        for(int i=0;i<N;i++)
        {
            while(N > 0)
            {
                dig= N%10;
                product=product*dig;
                N=N/10;
            }
        }
        System.out.println(product);
    }
}