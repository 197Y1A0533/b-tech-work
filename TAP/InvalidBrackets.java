package TAP;

import java.util.Scanner;

public class InvalidBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        int count_a=0;
        int count_b=0;
        char ch;
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            if(ch=='(')
            count_a++;
            else
            {
                if(count_a<=0)
                count_b++;
                else
                count_a--;
            }
        }
        
        System.out.println(count_a+count_b);
        sc.close();
    }
}
