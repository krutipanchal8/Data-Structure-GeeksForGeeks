package GeeksForGeeks.mathematics;
import java.util.*;
class math {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        //taking testcases
        int T=sc.nextInt();
        while(T-->0)
        {
            ExactlyThreeDivisor obj=new ExactlyThreeDivisor();
            int N;
            N=sc.nextInt();//taking N
            //calling function exactly3Divisors()
            System.out.println(obj.exactly3Divisors(N));
        }
    }
}
// } Driver Code Ends
//User function Template for Java
class ExactlyThreeDivisor
{
    public int exactly3Divisors(int N)
    {
        int cnt = 0;
        // since here we just have to check that whether the sqrt of N is prime or not, we will run the loop to sqrt N.
        if (N<=3)   return 0;
        for(int i=2;i<=Math.sqrt(N);i++){
            if (isPrime(i)){
                cnt++;
            }
        }
        return cnt;
    }

    public static boolean isPrime(int N) {
        if (N==2 || N==3)   return true;
        if (N%2==0 || N%3==0)   return false;
        for(int i=5;i*i<=N;i=i+6){
            if(N%i==0 || N%(i+2)==0)
                return false;
        }
        return true;
    }
}

