package GeeksForGeeks.mathematics;
import java.util.*;
class Mathematics {
    public static void main (String[] args) {

        //taking input using Scanner class
        Scanner sc=new Scanner(System.in);

        //taking total testcases
        int T=sc.nextInt();
        while(T-->0)
        {

            GPTerm  obj=new GPTerm ();
            int A,B;

            //taking A and B
            A=sc.nextInt();
            B=sc.nextInt();
            int N;

            //taking N
            N=sc.nextInt();

            //calling method termOfGP() of class GP
            System.out.println((int)Math.floor(obj.termOfGP(A,B,N)));

        }

    }
}
// } Driver Code Ends


//User function Template for Java

class GPTerm
{

    public double termOfGP(int A,int B,int N)
    {
        //As we know GP follows as a+ar^1+...+ar^n we can find ratio by divinding 2 terms
        double term=0.0;
        double ratio = (double)B/A;
        term = A * Math.pow(ratio,N-1);
        return term;
    }

}

