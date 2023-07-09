import java.io.*;
class StringInDifferentLine
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
        int len,i;
        String s= input.readLine(),w="";
        s=s+" ";
        char ch;
        len=s.length();
        for(i=0;i<len;i++)
        {
            ch=s.charAt(i);
            if(ch!=' ')
            {
                w=w+ch;
            }
            else
            {
                System.out.println(w);
                w="";
            }
        }
    }
}