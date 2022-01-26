package GeeksForGeeks.mathematics;

import java.io.*;
import java.util.*;
class job {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);

        int T=sc.nextInt();//input number of testcases
        while(T-->0)
        {
            CelToFeren obj=new CelToFeren();

            int C;
            C=sc.nextInt();//input temperature in celscius

            System.out.println((int)(obj.cToF(C)));//print the output
        }

    }
}
// } Driver Code Ends


//User function Template for Java


class CelToFeren
{
    public double cToF(int C)
    {
        // Your code here
//        double fahrenheit = (9*C)/5d + 32;
//        return fahrenheit;
        return (1.8*C + 32);
    }
}