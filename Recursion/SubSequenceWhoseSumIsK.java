//program for subsequence whose sum is k using recursion

package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class SubSequenceWhoseSumIsK {
    static void subSet(int n,ArrayList<Integer> l,int ind,int ar[],int k,int sum){
        if(ind==n){
            if (sum==k) {
            for(int auto :l)
            System.out.print(auto+" ");
            System.out.println();
        }
        return;
        }
        l.add(ar[ind]);
        sum =sum+ar[ind];
        subSet(n, l, ind+1, ar,k,sum);
        sum =sum-ar[ind];
        l.remove(l.size()-1);
        subSet(n, l, ind+1, ar,k,sum);
        
        
    }
    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<Integer>(); 
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        subSet(n,al,0,a,k,0);
        sc.close();
    }
}
