package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SubSetSum {

    public static void SubSetCombinationSum(int ind,int sum,int[] arr,List<Integer> ans){
        if(ind==arr.length){
            /* for(int i:ans)
                System.out.println(i+" ");
            System.out.println(); */
            ans.add(sum);
            return;
        }
        SubSetCombinationSum(ind+1, sum+arr[ind], arr, ans);
        SubSetCombinationSum(ind+1, sum, arr, ans);
    }

    /* public static List<Integer> SubSetCombination(int[] arr){
        List<Integer> ans = new ArrayList<>();
        SubSetCombinationSum(0,0,arr,ans);
        Collections.sort(ans);
        return ans;
    } */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        //List<Integer> l = SubSetCombination(a);
        List<Integer> ans = new ArrayList<>();
        SubSetCombinationSum(0,0,a,ans);
        Collections.sort(ans);
        for(int i:ans)
            System.out.print(i+" ");

        sc.close();
    }
}
