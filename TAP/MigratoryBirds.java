package TAP;

import java.util.Scanner;

public class MigratoryBirds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] count=new int[6];
        
        /* for(int i=0;i<6;i++){
            count[i]=0;
        } */
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
       
        for(int i=0;i<n;i++){
            count[a[i]]++;
        }
        int max=0;
        int v=0;
        for(int i=0;i<6;i++){
            if(count[i]>max){
                max=count[i];
                v=i;
            }
        }
        System.out.println(v);
        sc.close();
    }
}
