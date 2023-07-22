package TAP;

import java.util.Scanner;

public class NoOfVowelInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        int count=0;
        char ch;
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            if(ch=='A' || ch=='E'|| ch=='I' || ch=='O'|| ch=='U' || ch=='a'|| ch=='e' || ch=='i'|| ch=='o' || ch=='u')
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}
