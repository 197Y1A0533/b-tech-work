package Practise_;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintAllSubSequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        List<Integer> l=new ArrayList<>();
        solve(0,n,a,l);
        sc.close();
    }

    private static void solve(int ind,int n, int[] a, List<Integer> l) {
        /* if(ind==n){
            for(int i=0;i<l.size();i++)
                System.out.print(l.get(i)+" ");
            System.out.println();
            return;
        } */
        if(ind==n){
            int sum=0;
            for(int i=0;i<l.size();i++)
                sum=sum+l.get(i);
            System.out.print(sum+" ");
            return;
        }
        l.add(a[ind]);
        solve(ind+1,n, a, l);
        l.remove(l.size()-1);
        solve(ind+1,n, a, l);
    }
}
