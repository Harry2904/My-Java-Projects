import java.io.*;
class Fibonacci
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(input.readLine());
        int a=0,b=1,c;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=0;i<N-2;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
    }
}
