package Geeks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*public class MakePalindrome {

    public static void findCombinations(String[] a,boolean[] freq,List<List<String>> ans,List<String> ds){
        if(ds.size()==a.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<a.length;i++){
            if(!freq[i]){
                freq[i]=true;
                ds.add(a[i]);
                findCombinations(a,freq,ans, ds);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    }
    public static boolean combinations(String[] a){
        List<List<String>> ans = new ArrayList<>();
        boolean[] freq=new boolean[a.length];//default false in java
        findCombinations(a,freq,ans,new ArrayList<>()); 
        //List<List<String>> l = combinations(a);
        boolean flag=false;
        for(List<String> j:ans){
            String result = String.join("", j);
                String s="";
                for(int i=result.length()-1;i>=0;i--){
                    s=s+result.charAt(i);
                }
                if(s.equalsIgnoreCase(result)){
                    flag= true;
                    break;
                }
                else
                    flag= false;    
        }
        return flag;    
    }



    

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String a[]=new String[n];
        String b="";
        for(int i=0;i<n;i++){
            a[i]=sc.next();
            b=b+a[i];
        }

        if (combinations(a)) 
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
 
        sc.close();
    }
    
}*/



/* public class MakePalindrome {

    public static boolean findCombinations(String[] a,boolean[] freq,List<List<String>> ans,List<String> ds){
        if(ds.size()==a.length){
            ans.add(new ArrayList<>(ds));
            for(List<String> j:ans){
                String result = String.join("", j);
                //System.out.println(result);
                    String s="";
                    for(int i=result.length()-1;i>=0;i--){
                        s=s+result.charAt(i);
                    }
                    if(s.equalsIgnoreCase(result)){
                        return true;
                    }   
            }
            return false;
        }
        for(int i=0;i<a.length;i++){
            if(!freq[i]){
                freq[i]=true;
                ds.add(a[i]);
                if (findCombinations(a,freq,ans, ds)) {
                    return true;
                }
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String a[]=new String[n];
        String b="";
        for(int i=0;i<n;i++){
            a[i]=sc.next();
            b=b+a[i];
        }

        List<List<String>> ans = new ArrayList<>();
        boolean[] freq=new boolean[a.length];//default false in java

        if (findCombinations(a,freq,ans,new ArrayList<>())) 
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
 
        sc.close();
    }
    
}

 */









public class MakePalindrome {

    public static boolean findCombinations(int ind ,String[] a,List<List<String>> ans){
        if(ind==a.length){
            List<String> ds =new ArrayList<>();
            for(int i=0;i<a.length;i++)
                ds.add(a[i]);
            ans.add(new ArrayList<String>(ds));
            for(List<String> j:ans){
                String result = String.join("", j);
                //System.out.println(result);
                    String s="";
                    for(int i=result.length()-1;i>=0;i--){
                        s=s+result.charAt(i);
                    }
                    if(s.equalsIgnoreCase(result)){
                        return true;
                    }   
            }
            return false;
        }

        for(int i=ind;i<a.length;i++){
            swap(a[i],a[ind],a,i,ind);
            if (findCombinations(ind+1, a, ans)) {
                return true;
            }
            swap(a[i],a[ind],a,i,ind);
        }
        
        return false;
    }

    public static void swap(String x, String y, String[] a,int i,int j){
        String t=a[i];
        a[i]=y;
        a[j]=t;
    }
    
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String a[]=new String[n];
        String b="";
        for(int i=0;i<n;i++){
            a[i]=sc.next();
            b=b+a[i];
        }

        List<List<String>> ans = new ArrayList<>();

        if (findCombinations(0,a,ans) )
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
 
        sc.close();
    }
    
}

