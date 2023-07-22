package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PalindromePartioning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        //String s="aab";
        List<List<String>> l = combinations(s);
        for(List<String> i:l)
            System.out.print(i+" ");
        sc.close();
    }

    private static List<List<String>> combinations(String s) {
        List<List<String>> res=new ArrayList<>() ;
        List<String> path=new ArrayList<>() ;
        partition(0,s,path,res);
        return res;
    }

    private static void partition(int ind, String s, List<String> path, List<List<String>> res) {
        if(ind==s.length()){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=ind;i<s.length();i++){
            if(isPalin(s,ind,i)){
                path.add(s.substring(ind, i+1));
                partition(ind+1, s, path, res);
                path.remove(path.size()-1);
            }
        }
    }

    private static boolean isPalin(String s, int start, int end) {
        while (start<=end) {
            if (s.charAt(start++)!=s.charAt(end--)) {
                return false;
            }
        }
        return true;
    }
}
