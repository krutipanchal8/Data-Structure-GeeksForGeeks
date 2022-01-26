package GeeksForGeeks.mathematics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int a, b, c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            QuadraticRoot obj = new QuadraticRoot();
            ArrayList<Integer> ans = obj.quadraticRoots(a, b, c);
            if (ans.size() == 1 && ans.get(0) == -1)
                System.out.print("Imaginary");
            else
                for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends


// User function Template for Java

class QuadraticRoot {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        ArrayList<Integer> roots = new ArrayList<Integer>();
        int d = (int)(Math.pow(b,2) - (4*a*c));
        if (d<0){
            roots.add(-1);
        }
        else{
            int r1 = (int)Math.floor((-b+Math.sqrt(d))/(2*a));
            int r2 = (int)Math.floor((-b-Math.sqrt(d))/(2*a));
            roots.add(Math.max(r1,r2));
            roots.add(Math.min(r1,r2));
        }
        return roots;
    }
}
