package Geeks;

import java.util.Scanner;

public class Wifi_Range 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int n=sc.nextInt();
        int x=sc.nextInt();
        boolean ans=wifiRange(n,s,x);
        if(ans)
            System.out.println("1");
        else
            System.out.println("0");
        sc.close();
    }
    static boolean wifiRange(int N, String S, int X) 
    { 
        int i=0;
        int c=0;
        int p=0;
        /* while (i<N) {
            for(int j=0;j<(X*2)+1;j++){
                if (S.charAt(p)=='1') {
                    c=0;
                    p=j+1;
                    break;
                }
                else{
                    p++;
                    c=c+1;
                }
            }
            if (c>=(X*2)+1) {
                return false;
            }
            i++;
        } */
        int j=0;
        while (i<N) {
            while(c<(X*2)+1){
                System.out.println("c1:"+c);
                if (S.charAt(p)=='1') {
                    c=0;
                    System.out.println("c2:"+c);
                    p=j+1;
                    j=j+1;
                    break;
                }
                else{
                    p++;
                    j=j+1;
                    c=c+1;
                    System.out.println("c3:"+c);
                }
            }
            if ((c>=(X*2)+1) || ((X*X)==c)) {
                return false;
            }
            i++;
        }
        System.out.println(c);
        return true;
        
    }
}