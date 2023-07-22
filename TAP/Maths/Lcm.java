package TAP.Maths;

import java.util.Scanner;

public class Lcm {
    static int lcmBrute(int a,int b){
        int res=Math.max(a, b);
        while(true){
            if(res%a==0 && res%b==0)
            break;
            res=res+Math.max(a, b);
            //res++;
        }
        return res;
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

    static int lcmEuclid(int a,int b){
        return a*b/garbielGcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(lcmBrute(a,b));
        System.out.println(lcmEuclid(a,b));
        sc.close();
    }
}
