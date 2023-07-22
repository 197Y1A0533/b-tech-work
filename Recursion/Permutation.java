package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Permutation {
    public static void findCombinations(int[] arr,boolean[] freq,List<List<Integer>> ans,List<Integer> ds){
        if(ds.size()==arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(!freq[i]){
                freq[i]=true;
                ds.add(arr[i]);
                findCombinations(arr,freq,ans, ds);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    }
    public static List<List<Integer>> combinations(int[] cand){
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] freq=new boolean[cand.length];//default false in java
        findCombinations(cand,freq,ans,new ArrayList<>()); 
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        List<List<Integer>> l = combinations(a);
        for(List<Integer> i:l)
            System.out.print(i+" ");
        sc.close();
    }
}
