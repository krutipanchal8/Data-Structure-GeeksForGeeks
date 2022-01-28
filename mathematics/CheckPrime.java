package GeeksForGeeks.mathematics;
import java.util.*;
class Mathema {
    public static void main (String[] args) {

        //taking input using Scanner class
        Scanner sc=new Scanner(System.in);

        int T=sc.nextInt();//input testcases


        while(T-->0)//while testcase have not been exhausted
        {
            CheckPrime obj=new CheckPrime ();
            int N;
            N=sc.nextInt();//input n
            if(obj.isPrime(N))
                System.out.println("Yes");
            else
                System.out.println("No");

        }

    }
}

// } Driver Code Ends


//User function Template for Java

class CheckPrime {
    public boolean isPrime(int N) {
        // code here
        if(N<=1) return false;
        else if(N==2) return true;
        else if(N%2==0) return false;
        //Here we are taking sqrt of N. because apart from root, for two factor a,b for n=a*b, one of them would be larger than other one
        //Ex: n = 16 ; a=4 b=4 exept from them it's a=8,b=2. so one is larger than 4
        for(int i=3;i<=Math.sqrt(N);i++){
            if(N%i==0)
                return false;
        }
        return true;
    }
}
