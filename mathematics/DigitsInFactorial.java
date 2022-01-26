package GeeksForGeeks.mathematics;
import java.math.BigInteger;
import java.util.*;
class Main {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);

        //taking total testcases
        int T=sc.nextInt();

        while(T-->0)
        {
            DigitsInFactorial obj=new DigitsInFactorial();
            int N;

            //taking N
            N=sc.nextInt();

            //calling method digitsInFactorial()
            System.out.println(obj.digitsInFactorial(N));

        }

    }
}
// } Driver Code Ends
//User function Template for Java
class DigitsInFactorial{
    public int digitsInFactorial(int N){
        // 10^k-1 < n < k
        // by taking log10 on all the side
        // k-1 < n <k
        // so hence it is proved that floor(log(n) + 1) = k
        // log(n!) = log1+log2+...+logn
        if (N<0) return 0;
        if (N<=1) return 1;
        double digits = 0;
        for (int i=2;i<=N;i++){
            digits += Math.log10(i);
        }
        return (int)(Math.floor(digits))+1;
    }
}



