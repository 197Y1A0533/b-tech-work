package TAP;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        String s="";
        for(int i=str.length()-1;i>=0;i--){
            s=s+str.charAt(i);
        }
        if(s.equalsIgnoreCase(str))
        System.out.println("Palindrome");
        else
        System.out.println("Not Palindrome");
        sc.close();
    }
}
