package GeeksForGeeks.mathematics;

import java.io.*;
import java.util.*;

//find absolute value

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // number of testcases
        while (T > 0) {
            int I = sc.nextInt();
            AbsoluteValue obj = new AbsoluteValue();
            System.out.println(obj.absolute(I));

            T--;
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class AbsoluteValue {
    public int absolute(int I) {
        // code here
        // we can also do return I<0 ? -I : I;
        // can use Math.abs()
        if(I<0){
            return -I;
        }
        return I;
    }
}
