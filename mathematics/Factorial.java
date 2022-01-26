package GeeksForGeeks.mathematics;

import java.util.Scanner;
import java.util.*;

class fact {
    public static void main(String[] args) {

        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);

        //taking testcases
        int T = sc.nextInt();
        while (T-- > 0) {

            //creating an object of class Factorial
            Factorial obj = new Factorial();
            int N;

            //taking N
            N = sc.nextInt();

            //calling factorial() method
            //of class Factorial
            System.out.println(obj.factorial(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Factorial {

    public long factorial(int N) {
        if(N==1)
            return 1;
        return N*factorial(N-1);
    }
}
