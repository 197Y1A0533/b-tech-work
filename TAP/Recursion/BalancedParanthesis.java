package TAP.Recursion;

import java.util.Scanner;

public class BalancedParanthesis {
    static void balanceBracket(char[] arr,int n,int i,int o,int c){
        if(i==arr.length){
            System.out.println(arr);
        }
        if(o<n){
            arr[i] ='(';
            balanceBracket(arr,n,i+1,o+1,c);
        }
        if(c<o){
            arr[i] =')';
            balanceBracket(arr,n,i+1,o,c+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = new char[n*2];
        balanceBracket(arr,n,0,0,0);
        sc.close();
    }
}
