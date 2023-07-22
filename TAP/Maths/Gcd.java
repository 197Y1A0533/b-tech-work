package TAP.Maths;

import java.util.Scanner;

public class Gcd {
    static int gcdUsingBrueteForce(int a,int b){
        if(a>b){
            for(int i=b;i>0;i--){
                if(a%i==0 && b%i==0){
                    return i;
            }
            }
        }
        else{
            for(int i=a;i>0;i--){
                if(a%i==0 && b%i==0){
                        return i;
                }
            }
        }
        return -1;
    }

    static int euclidGcd(int a,int b){
        while (a!=b) {
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        return a;
    }

    static int garbielGcd(int a,int b){
        while (a!=0 && b!=0) {
            if(a>b){
                a=a%b;
            }
            else{
                b=b%a;
            }
        }
        if(a!=0)
        return a;
        else
        return b;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        //System.out.println(gcdUsingBrueteForce(a, b));
        //System.out.println(euclidGcd(a, b));
        System.out.println(garbielGcd(a, b));
        sc.close();
    }
}
