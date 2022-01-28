package GeeksForGeeks.mathematics;

import java.math.BigInteger;
import java.util.Scanner;

public class FindTrailingZeroes<f> {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        sc.nextLine();
//        BigInteger f = new BigInteger("1"); // Or BigInteger.ONE
//        for (int i = 2; i <= num; i++)
//            f = f.multiply(BigInteger.valueOf(i));
//        System.out.println("Factorial: "+f);
//        int cnt = 0;
//        BigInteger rem = new BigInteger("0");
//        while (f.signum() ==1){  // this checks whether the number is >1 or not. it returns -1 for n<0 , 0 for n==0 and 1 for n>0
//            rem = f.mod(BigInteger.valueOf(10));
//            if (rem.equals(BigInteger.valueOf(0)))   cnt++;
//            else break;
//            System.out.println("rem" + rem);
//            f=f.divide(BigInteger.valueOf(10));
//        }
        //There is another solution for this program
        // if there is 5, then we will find 2 below that, that will contribute to one 0.
        // so till any n, we get n/5 + n/25 + n/125 10's
        int res =0;
        for(int i =5; i<=num ; i=i*i){
            res+= num/i;
        }
        System.out.println("count: "+res);
    }
}
