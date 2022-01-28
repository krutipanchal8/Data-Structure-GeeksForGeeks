package GeeksForGeeks.mathematics;
import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        //taking testcases
        int t = Integer.parseInt(read.readLine());

        while(t-- > 0) {
            String[] str = read.readLine().trim().split(" ");

            //taking input a and b
            Long a = Long.parseLong(str[0]);
            Long b = Long.parseLong(str[1]);

            //calling method sumUnderModulo()
            System.out.println(new AdditionUnderModulo().sumUnderModulo(a,b));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class AdditionUnderModulo {
    public static long sumUnderModulo(long a, long b){
        long res = (long)(Math.pow(10,9)+7);
        return (a%res+b%res)%res;
    }
}
