package Geeks;

import java.util.Scanner;

public class Toggle {
    static int subSet(int n,int arr[]){
        int start = 0,curr = 0;
        int mx = 0;
        int count = 0;
        //using sliding window
        while(curr<arr.length){
            if(arr[curr]==1){
                count++;
                mx = Math.max(mx,count);
                curr++;
            }
            else{
            while(curr<arr.length && arr[curr]==0){
                count++;
                curr++;
                mx = Math.max(mx,count);
            }
            start = curr;
            while(curr<arr.length&&arr[curr]==1){
                count++;
                curr++;
               mx = Math.max(mx,count);
            }
            curr=start;
            count=0;
            }
    }
    return mx;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.println(subSet(n,a));
        sc.close();
    }
}
