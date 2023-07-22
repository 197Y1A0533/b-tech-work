package Instacks;

import java.util.Scanner;

public class SquareFreeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long i,chksqr,j=0;
        long  temp[]=new long[1000];
        int count=0,k;
        double sqnum;
        for(i=2;i<=n/2;i++){
            if(n%i==0){    
                count++;
                sqnum=Math.sqrt(i);
                chksqr=(long) sqnum;
                System.out.println("sqnum   "+sqnum);
                System.out.println("chksqr  "+chksqr);
                if(chksqr==sqnum)
                {
                    count--;
                    temp[(int) j]=i;
                    j++;
                }
                else
                {
                    for(k=0;k<j;k++) {
                        if(i>temp[k] && j!=0)
                        {
                            if(i%temp[k]==0)
                            {	
                          	    count--;
                        	    k=(int) (j+1);
                            }
                        }
                        else
                            break;
                    }
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}
