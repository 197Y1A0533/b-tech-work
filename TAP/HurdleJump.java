package TAP;

import java.util.Scanner;

public class HurdleJump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max=0;
        for(int i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        if(max>k)
            System.out.println(max-k);
        else
            System.out.println("0");
        sc.close();
    }
}
