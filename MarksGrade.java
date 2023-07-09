import java.io.*;
class MarksGrade
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(input.readLine()),Marks=N;
        if(Marks >= 80)
        {
            System.out.println("A Grade");
        }
        else if(Marks >= 60 && Marks < 80)
        {
            System.out.println("B Grade");
        }
        else if(Marks >= 40 && Marks < 60)
        {
            System.out.println("C Grade");
        }
        else
        {
            System.out.println("D Grade");
        }
    }
}