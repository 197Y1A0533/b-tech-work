//without using extra memory for freq array
package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Permutation2 {
    public static void findCombinations(int ind ,int[] arr,List<List<Integer>> ans){
        if(ind==arr.length){
            List<Integer> ds =new ArrayList<>();
            for(int i=0;i<arr.length;i++)
                ds.add(arr[i]);
            ans.add(new ArrayList<Integer>(ds));
            return;
        }
        for(int i=ind;i<arr.length;i++){
            swap(i,ind,arr);
            findCombinations(ind+1, arr, ans);
            swap(i, ind, arr);
        }
    }
    public static void swap(int i, int j, int[] arr){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    public static List<List<Integer>> combinations(int[] cand){
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0,cand,ans); 
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
