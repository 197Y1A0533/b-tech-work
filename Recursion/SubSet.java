// subset with out duplicates 
package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SubSet {
    public static void findCombinations(int ind,int[] arr,List<List<Integer>> ans,List<Integer> ds){
        ans.add(new ArrayList<>(ds));
        for(int i=ind;i<arr.length;i++){
            if(i!=ind && arr[i]==arr[i-1])
                continue;
            ds.add(arr[i]);
            findCombinations(i+1, arr,ans, ds);
            ds.remove(ds.size()-1);
        }
    }
    public static List<List<Integer>> combinations(int[] cand){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(cand);
        findCombinations(0,cand,ans,new ArrayList<>()); 
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
