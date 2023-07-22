package Practise_;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class combinationSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int k=sc.nextInt();
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        List<Integer> l=new ArrayList<>();
        solve(0,n,k,0,a,l);
        sc.close();
    }

    private static void solve(int ind,int n,int k,int sum, int[] a, List<Integer> l) {
        if(ind==n){
            if (k==0) {
                for(int i=0;i<l.size();i++)
                    System.out.print(l.get(i)+" ");
                System.out.println();
            }
            return;
        }
      
        if(a[ind]<=k){
            l.add(a[ind]);
            solve(ind,n,k-a[ind],sum, a, l);
            l.remove(l.size()-1);
        }
        solve(ind+1,n,k,sum, a, l);
    }
}
