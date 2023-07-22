package TAP.Maths;

import java.util.Scanner;

public class PrimeFactor {
    static void printPrimefactor(int n){
        int i=2;
        while(i*i<=n){
            while(n%i==0){
                System.out.println(i);
                n=n/2;
            }
            i++;
        }
        if(n>1)
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        //printDivisor(a);
        printPrimefactor(a);
        sc.close();
    }
}
