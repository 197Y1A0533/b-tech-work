//program for subsequence using recursion

package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class SubsequenceArray {
    static void subSet(int n,ArrayList<Integer> l,int ind,int ar[]){
        if(ind==n){
        for(int i :l)
        System.out.print(i+" ");
        System.out.println();
        return;
        }
        subSet(n, l, ind+1, ar);
        l.add(ar[ind]);
        subSet(n, l, ind+1, ar);
        l.remove(l.size()-1);
        
    }
    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<Integer>(); 
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        subSet(n,al,0,a);
        sc.close();
    }
}
