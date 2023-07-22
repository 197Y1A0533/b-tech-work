package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class EvenSubSequennceSum {
    static boolean subSet(int n,ArrayList<Integer> l,int ind,int ar[]){
        int sum=0;
        if(ind==n){
            for(int i :l){
                sum=sum+i;
                System.out.print(i+" ");
            }
            System.out.println("----->"+sum);
            System.out.println();
            if(sum==0 && (l.size()%2==0) && l.size()>1)
                return true;
            else
                return false;
        }
        if(subSet(n, l, ind+1, ar)==true)
            return true;
        l.add(ar[ind]);
        if(subSet(n, l, ind+1, ar))
            return true;
        l.remove(l.size()-1);

        return false;

        /* if(ind==n){
            System.out.print(sum+"  ----->");
            if((l.size()%2==0)){
                for(int i :l)
                    System.out.print(i+" ");
                System.out.println();
                if(sum==0)
                    return true;
                else
                    return false;
            }
        }
        if(subSet(n, l, ind+1, ar,sum+ar[ind])==true)
            return true;
        l.add(ar[ind]);
        if(subSet(n, l, ind+1, ar,sum)==true)
            return true;
        l.remove(l.size()-1);
        return false; */
    }
    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<Integer>(); 
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println(subSet(n,al,0,a));
        sc.close();
    }
}
