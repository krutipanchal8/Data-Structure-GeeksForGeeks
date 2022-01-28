package GeeksForGeeks.mathematics;

import java.util.Scanner;

public class PalindromNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isPalindrome(num)){
            System.out.println("Number is palindrome");
        }else{
            System.out.println("Number is not palindrome");
        }
    }

    public static boolean isPalindrome(int n){
        int temp = 0,rem = 0, num = n ;
        int size = Integer.toString(num).length();
        boolean flag = false;
        while (num > 0) {
            rem = num % 10;
            temp = temp + rem * (int)Math.pow(10,size-1);
            num = num/10;
            size--;
        }
        System.out.println(temp);
        System.out.println(n);
        if (temp == n)
            flag = true;
        return flag;
    }
}
