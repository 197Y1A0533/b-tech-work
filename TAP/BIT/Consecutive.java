package TAP.BIT;

import java.util.Scanner;

public class Consecutive {
    static boolean longestConsecutive(int n){
        if((n & (n<<1))!=0)
        return true;
        else
        return false;
    }

    static int longestConsecutiveEfficient(int n){
        int c=0;
        while(n>0){
            n=(n & (n<<1));
            c=c+1;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        //System.out.println(longestConsecutive(a));
        System.out.println(longestConsecutiveEfficient(a));
        sc.close();
    }
    
}
