package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CombinationSum {
    public static void findCombination(int ind,int[] arr,int tar,List<List<Integer>> ans, List<Integer> ds){
        if(ind==arr.length){
            if(tar==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if(arr[ind]<=tar){
            ds.add(arr[ind]);
            findCombination(ind, arr, tar-arr[ind], ans, ds);
            ds.remove(ds.size()-1);
        }
        findCombination(ind+1, arr, tar, ans, ds);
    }
    public static List<List<Integer>> combinationSum(int[] cand,int t){
        List<List<Integer>> ans =new ArrayList<>();
        findCombination(0,cand,t,ans,new ArrayList<>());
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();

        List<List<Integer>> al = combinationSum(a,t);

        /* for(int i=0;i<al.size();i++){
            for(int j=0;j<al.get(i).size();j++)
                System.out.print(al.get(i).get(j)+" ");
            System.out.println();
        } */
        
        /* for(List<Integer> i:al)
            System.out.println(al); */
        System.out.println(al);
        sc.close();
    }
}
