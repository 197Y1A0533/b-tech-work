package TAP;

import java.util.Scanner;

public class DevuFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i=0;i<test;i++){
            int n = sc.nextInt();
            int[] a=new int[n];
            for(int j=0;j<n;j++){
                a[j]=sc.nextInt();
            }
    
            int temp;
            for(int k=0;k<n-1;k++){
                for(int l=0;l<n-k-1;l++){
                    if(a[l]>a[l+1]){
                        temp=a[l];
                        a[l]=a[l+1];
                        a[l+1]=temp;
                    }
                }
            } 

            int count=1;
            for(int b=0;b<n-1;b++){
                if(a[b]!=a[b+1])
                count++;
            }
            System.out.println(count);
        }
        sc.close();
    }
}
