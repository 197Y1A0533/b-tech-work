package Geeks;

import java.util.Scanner;

public class ex {
    public static void main(String[] args) {
        
        //ArrayList<Integer> al = new ArrayList<Integer>(); 
        Scanner sc =new Scanner(System.in);
        //int n=2;
        //int k=sc.nextInt();
        //int a[]={8,-8,7,9};
        //int a[]={0,0};
        int n=sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        //System.out.println(subSet(0,0,a,al,1));

        int res=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<=n;j+=2){
                if(((a.length)+1)%2==0){
                    for(int k=i;k<j;k++)
                        res=res+a[k];
                }
                else{
                    for(int k=i;k<j;k++)
                    res=res+a[k];
                }
            }
        }
        if(res==0)
            System.out.println("YES");
        else
            System.out.println("NO");
        sc.close();
    }
}
