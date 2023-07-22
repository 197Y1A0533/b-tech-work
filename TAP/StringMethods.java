package TAP;

import java.util.Scanner;

public class StringMethods{
    static String toUpperCase(String str){
        String t="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z'){
                t=t+(char)(ch-32);
            }
            else
            t=t+ch;
        }
        return t;
    }

    static String toLowerCase(String str){
        String t="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='A' && ch<='Z'){
                t=t+(char)(ch+32);
            }
            else
            t=t+ch;
        }
        return t;
    }

    static int indexOf(String str,char c){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==c){
                return i;
            }
        }
        return -1;
    }

    static int indexOf(String str,char c,int p){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==c){
                count=count+1;
                if(count==p)
                return i;
            }
        }
        return -1;
    }

    static int lastIndexOf(String str,char c){
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)==c){
                return i;
            }
        }
        return -1;
    }

    static String trim(String str){
        String t="";
        int fc=0,lc=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ')
            fc=fc+1;
            else
            break;
        }
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)==' ')
            lc=lc+1;
            else
            break;
        }
        for(int i=fc;i<str.length()-lc;i++){
            t=t+(char)(str.charAt(i));
        }
        return t;
    }

    static char[] toCharArray(String str){
        char[] ch=new char[str.length()];
        for(int i=0;i<str.length();i++){
            ch[i]=str.charAt(i);
        }
        return ch;
    }

    static boolean equals(String str,String str1){
        if(str.length()!=str1.length())
        return false;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=str1.charAt(i)){
                return false;
            }
        }
        return true;
    }

    static boolean startsWith(String str,String str1){
        int count=0;
        for(int i=0;i<str1.length();i++){
            if(str.charAt(i)==str1.charAt(i)){
                count=count+1;
            }
            else
            break;
        }
        if(count==str1.length())
        return true;
        else
        return false;
    }

    static boolean endsWith(String str,String str1){
        int count=0;
        for(int i=str.length()-str1.length();i<str.length();i++){
            if(str.charAt(i)==str1.charAt(count)){
                count=count+1;
            }
            else
            break;
        }
        if(count==str1.length())
        return true;
        else
        return false;
    }

    static boolean contains(String str,String str1){
        int count=0;
        for(int i=0;i<str.length() && count<str1.length();i++){
            if(str.charAt(i)==str1.charAt(count)){
                count=count+1;
            }
            else
            count=0;
        }
        if(count==str1.length())
        return true;
        else
        return false;
    }

    static String replace(String str,char old,char new_c){
        char[] ch=toCharArray(str);
        for(int i=0;i<str.length();i++){
            if(ch[i]==old){
                ch[i]=new_c;
            }
        }
        return new String(ch); 

            //or 

        /* String t="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==old){
                t=t+new_c;
            }
            else
            t=t+(char)(str.charAt(i));
        }
        return t; */
    }

    static String subString(String str,int p){
        String t="";
        for(int i=p;i<str.length();i++){
            t=t+(char)(str.charAt(i));
        }
        return t;
    }

    static String subString(String str,int st,int en){
        String t="";
        for(int i=st;i<en;i++){
            t=t+(char)(str.charAt(i));
        }
        return t;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
        //String s1 = sc.nextLine();
        //char ch=sc.next().charAt(0);
        //char ch_n=sc.next().charAt(0);
        int pos=sc.nextInt();
        int end_pos=sc.nextInt();
        //System.out.println(toUpperCase(s));
        //System.out.println(toLowerCase(s));
        //System.out.println(indexOf(s,ch));
        //System.out.println(indexOf(s,ch,pos));
        //System.out.println(lastIndexOf(s,ch));
        //System.out.println(trim(s));
        //System.out.println(toCharArray(s));
        //System.out.println(equals(s,s1));
        //System.out.println(startsWith(s,s1));
        //System.out.println(endsWith(s,s1));
        //System.out.println(contains(s,s1));
        //System.out.println(replace(s,ch,ch_n));
        System.out.println(subString(s,pos,end_pos));
        sc.close();
    }
}