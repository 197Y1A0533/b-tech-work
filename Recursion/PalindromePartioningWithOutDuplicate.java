
package Recursion;

import java.util.HashSet;
import java.util.Scanner;

public class PalindromePartioningWithOutDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        //String s="aab";
        HashSet<HashSet<String>> l = combinations(s);
        for(HashSet<String> i:l){
            System.out.print(i+" ");
            break;
        }
        sc.close();
    }

    private static HashSet<HashSet<String>> combinations(String s) {
        HashSet<HashSet<String>> res=new HashSet<>() ;
        HashSet<String> path=new HashSet<>() ;
        partition(0,s,path,res);
        return res;
    }

    private static void partition(int ind, String s, HashSet<String> path, HashSet<HashSet<String>> res) {
        if(ind==s.length()){
            res.add(path);
            return;
        }
        for(int i=ind;i<s.length();i++){
            if(isPalin(s,ind,i)){
                path.add(s.substring(ind, i+1));
                partition(ind+1, s, path, res);
                //path.remove(path.size()-1);     //remove comment
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
