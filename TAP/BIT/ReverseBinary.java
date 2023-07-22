package TAP.BIT;

import java.util.Scanner;

public class ReverseBinary {
    static int reverseBinary(int n){
        int f=31,l=0;
        int rev=0;
        while(f>l){
            if((n & (1<<f))!=0)
            rev=rev | (1<<l);
            if((n & (1<<l))!=0)
            rev=rev | (1<<f);
            f--;
            l++;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(reverseBinary(a));
        sc.close();
    }
}
