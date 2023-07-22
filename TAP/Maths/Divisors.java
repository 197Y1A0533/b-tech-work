package TAP.Maths;

import java.util.Scanner;

public class Divisors {
    static void printDivisor(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+"  ");
            }
        }
    }

    static void printDivisor1(int n){
        int i=0;
        for( i=1;i*i<=n;i++){
            if(n%i==0){
                System.out.print(i+"  ");
                if (i!=n/i) {//comment this
                    System.out.print(n/i+"  ");
                } 
            }
        }
        /* for(;i>=1;i--){
            if(n%i==0 && i!=n/i){
                System.out.print(n/i+"  ");
            }
        } */
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        //printDivisor(a);
        printDivisor1(a);
        sc.close();
    }
}
