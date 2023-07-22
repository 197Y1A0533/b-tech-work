package TAP.Maths;

import java.util.Scanner;

public class PrimeNumber {
    static boolean isPrime(int n){
        for(int i=2;i<n/2;i++){
            if(n%i==0)
            return false;
        }
        return true;
    }

    static boolean isPrimeSquareRoot(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
            return false;
        }
        return true;
    }

    static boolean isPrimeEfficient(int n){
        if(n==1)
        return false;
        if(n==2 || n==3)
        return true;
        if(n%2==0 || n%3==0)
        return false;
        for(int i=5;i<=Math.sqrt(n);i=i+6){
            if(n%i==0 || n%(i+2)==0)
            return false;
        }
        return true;
    }

    static void printPrime(int n){
        boolean[] p=new boolean[n+1];
        for(int i=2;i*i<=n;i++){
            if(p[i]==false){
                for(int j=i*i;j<=n;j=j+i)
                p[j]=true;
            }
        }
        for(int i=2;i<=n;i++){
            if(p[i]==false)
            System.out.print(i+"    ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        //System.out.println(isPrime(a));
        //System.out.println(isPrimeSquareRoot(a));
        //System.out.println(isPrimeEfficient(a));
        printPrime(a);
        sc.close();
    }
}
