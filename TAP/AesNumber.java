package TAP;

import java.util.Scanner;

public class AesNumber {
    static boolean isAes(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
            count++;
        }
        if(count==4)
        return true;
        else
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(isAes(i))
            System.out.println(i);
        }
        sc.close();
    }
}
