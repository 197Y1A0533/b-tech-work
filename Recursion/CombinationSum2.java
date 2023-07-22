package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CombinationSum2 {
    public static void findCombinations(int ind,int[] arr,int t,List<List<Integer>> ans,List<Integer> ds){
            if(t==0){
                ans.add(new ArrayList<>(ds));
                return;
            }
        for(int i=ind;i<arr.length;i++){
            if(i>ind && arr[i]==arr[i-1])
                continue;
            if(arr[i]>t)
                break;
            ds.add(arr[i]);
            findCombinations(i+1, arr, t-arr[i], ans, ds);
            ds.remove(ds.size()-1);
        }
    }
    public static List<List<Integer>> combinations(int[] cand,int t){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(cand);
        findCombinations(0,cand,t,ans,new ArrayList<>()); 
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        List<List<Integer>> l = combinations(a,t);
        for(List<Integer> i:l)
            System.out.print(i+" ");
        sc.close();
    }
}
