package TAP.BIT;

import java.util.Scanner;

public class PowerOf2 {
    static boolean isPow(int n){
        if(n==0)
        return false;
        return (n & (n-1))==0;
    }

    static boolean isPowBrueteForce(int n){
        String  b="";
        while(n>=1){
            int r=n%2;
            n=n/2;
            b=r+b;
        }
        int c=0;
        //System.out.println(b);
        for(int i=b.length()-1;i>=0;i--){
            //System.out.println(i);
            if(b.charAt(i)=='1'){
                c=c+1;
            }
        }
        if(c==1)
        return true;
        else
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(isPow(a));
        System.out.println(isPowBrueteForce(a));
        sc.close();
    }
}
