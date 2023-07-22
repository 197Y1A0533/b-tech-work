package TAP;

import java.util.Scanner;

public class SOS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i=i+3){
            if(s.charAt(i)!='s')
            count=count+1;
            if(s.charAt(i+1)!='o')
            count++;
            if(s.charAt(i+2)!='s')
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}
