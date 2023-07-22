package TAP.BIT;

import java.util.Scanner;

public class SwapBits {
    static int swapEvenWithOddBits(int n){
        return (((n & 0xaaaaaaaa)>>>1) | ((n & 0x55555555)<<1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(swapEvenWithOddBits(a));
        sc.close();
    }
}
