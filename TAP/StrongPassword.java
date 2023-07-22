package TAP;

import java.util.Scanner;

public class StrongPassword {
    public static int minimumNumber(int n,String s){
        int lc=1,uc=1,sc=1,nu=1;
        for(int i=0;i<n;i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9')
            nu=0;
            else if(s.charAt(i)>='A' && s.charAt(i)<='Z')
            uc=0;
            else if(s.charAt(i)>='a' && s.charAt(i)<='z')
            lc=0;
            else
            sc=0;
        }
        if((nu+lc+uc+sc)>6-n)
        return (nu+lc+uc+sc);
        else
        return 6-n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String str =sc.next();
        //int a=minimumNumber(n,str);
        System.out.println(minimumNumber(n,str));
        sc.close();
    }
}
