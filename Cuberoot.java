import java.io.*;
class Cuberoot
{
    public static void main(String[] args)throws IOException
    {
      BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
      int N=Integer.parseInt(input.readLine());
      System.out.println(String.format("%.2f",Math.pow(N,1.0/3)));
    }
}