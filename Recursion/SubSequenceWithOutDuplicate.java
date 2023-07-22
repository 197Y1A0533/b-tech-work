//program for subsequence using recursion
//printing subsequence without duplicates 

package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SubSequenceWithOutDuplicate {
    static void subSet(int ind,int[] arr,List<List<Integer>> ans,ArrayList<Integer> ds){
        ans.add(new ArrayList<>(ds));
        for(int i=ind;i<arr.length;i++){
            if(i!=ind && arr[i]==arr[i-1])
                continue;
            ds.add(arr[i]);
            subSet(ind+1, arr, ans, ds);
            ds.remove(ds.size()-1);
        }
        
    }

    public static List<List<Integer>> subSetsWithDuplicates(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> ans =new ArrayList<>();
        subSet(0,arr,ans,new ArrayList<>());
        return ans;
    }

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        List<List<Integer>> al = subSetsWithDuplicates(a);
        for(List<Integer> i:al)
            System.out.print(i+" "); 
        sc.close();
    }
}
