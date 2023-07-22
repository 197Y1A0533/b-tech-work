package TAP.BIT;

import java.util.Scanner;

public class TrailingZeroes {
    static int trailingZeroes(int n){
        return (int)(Math.log(((n & n-1)^n))/Math.log(2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(trailingZeroes(a));
        sc.close();
    }
}
