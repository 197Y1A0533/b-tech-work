package TAP.Maths;

import java.util.Scanner;

public class Trailing {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int res=0;
        int pow=5;
        while(n>=pow){
            res=res+(n/pow);
            System.out.println(res);
            pow=pow*5;
        }
        System.out.println(res);
        sc.close();
    }
}
