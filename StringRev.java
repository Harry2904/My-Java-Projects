import java.io.*;
class StringRev
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
        String s= input.readLine(),rev="";
        int len,i;
        char ch;
        len=s.length();
        for(i=len-1;i>=0;i--)
        {
            ch= s.charAt(i);
            rev=rev+ch;
        }
        System.out.println(rev);
    }
}