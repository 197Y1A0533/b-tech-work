package TAP;

import java.util.Scanner;

public class AliceAndBob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n-1;i++){
            a[i]=sc.nextInt();
        }
        int max=(2*1+(n-1)*2)*n/2;
        int sum=0;
        for(int i=0;i<n-1;i++){
            sum=sum+a[i];
        }  
        System.out.println(max-sum);


    
        

        sc.close();
    }
}
