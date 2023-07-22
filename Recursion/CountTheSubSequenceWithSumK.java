
//program for subsequence count whose sum is k using recursion

package Recursion;

//import java.util.ArrayList;
import java.util.Scanner;

public class CountTheSubSequenceWithSumK {
    static int subSet(int n,int ind,int ar[],int k,int sum){
        if(ind==n){
            if (sum==k) 
                return 1;
            else
                return 0;
        }
        sum =sum+ar[ind];
        int le=subSet(n,ind+1, ar,k,sum);
        sum =sum-ar[ind];
        int r=subSet(n,ind+1, ar,k,sum);
        
       return le+r; 
    }
    public static void main(String[] args) {
    
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int count=subSet(n,0,a,k,0);
        System.out.println(count);
        sc.close();
    }
}

/* 
 
//program for subsequence count whose sum is k using recursion

package DP;

import java.util.ArrayList;
import java.util.Scanner;

public class CountTheSubSequenceWithSumK {
    static int subSet(int n,ArrayList<Integer> l,int ind,int ar[],int k,int sum,int c){
        if(ind==n){
            if (sum==k) 
                return 1;
            else
                return 0;
        }
        l.add(ar[ind]);
        sum =sum+ar[ind];
        int le=subSet(n, l, ind+1, ar,k,sum,c);
        sum =sum-ar[ind];
        l.remove(l.size()-1);
        int r=subSet(n, l, ind+1, ar,k,sum,c);
        
       return le+r; 
    }
    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<Integer>(); 
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int count=subSet(n,al,0,a,k,0,0);
        System.out.println(count);
        sc.close();
    }
}

 */