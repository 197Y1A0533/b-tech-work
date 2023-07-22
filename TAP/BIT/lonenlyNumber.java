package TAP.BIT;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class lonenlyNumber {
    static int lonelyInteger(int[] ar){
        Arrays.sort(ar);
        for(int i=0;i<ar.length-2;i+=2){
            if(ar[i]!=ar[i+1]){
                System.out.println(ar[i]);
            return ar[i];
            }
        }
        return ar[ar.length-1];
    }

    static int lonelyIntegerHash(int[] ar){
        HashSet<Integer> s=new HashSet<>();
        for(int i:ar){
            if(s.contains(i)){
                s.remove(i);
            }
            else{
                s.add(i);
            }
        }
        for(int i:s)
        return i;
        return -1;
    }

    static int lonelyIntegerEfficient(int[] ar){
        int res=0;
        for(int i:ar){
            res=res^i;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++)
        arr[i]=sc.nextInt();
        //System.out.println(lonelyInteger(arr));
        //System.out.println(lonelyIntegerHash(arr));
        System.out.println(lonelyIntegerEfficient(arr));
        sc.close();
    }
}
