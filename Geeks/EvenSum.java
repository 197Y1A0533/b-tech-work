package Geeks;



import java.util.ArrayList;
import java.util.Scanner;

public class EvenSum {
    static int subSet(int ind,int sum,int[] ar,ArrayList<Integer> l,int flag){
    
        if(ind==ar.length){
            System.out.println(ind+"    Hello:"+sum);
            if(ind%2==0 ){
                System.out.println("HI:"+ind);
                if (sum!=0) {
                    System.out.println("HI..............:");
                    return 0;}
                //else
                    //return 1;
            }
            return 1;
        }
        
        System.out.println(ind+"    sum:"+sum);
        if(subSet(ind+1,sum,ar,l,flag++)==0)
            return 0;
        if(subSet(ind+1,sum+ar[ind],ar,l,flag++)==0)
            return 0;
        return 1;
    }
    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<Integer>(); 
        Scanner sc =new Scanner(System.in);
        //int n=2;
        //int k=sc.nextInt();
        //int a[]={8,-8,7,9};
        //int a[]={0,0};
        int n=sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println(subSet(0,0,a,al,1));
        sc.close();
    }
}
