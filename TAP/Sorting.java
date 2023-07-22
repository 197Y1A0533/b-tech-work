package TAP;

import java.util.Scanner;

public class Sorting {
    static int[] bubbleSort(int[] ar){
        for(int i=0;i<ar.length-1;i++){
            for(int j=0;j<ar.length-i-1;j++){
                if(ar[j]>ar[j+1]){
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        return ar;
    }

    static int[] insertionSort(int[] ar){
        for(int i=1;i<ar.length;i++){
            int key=ar[i];
            int j=i-1;
            while(j>=0 && ar[j]>key){
                ar[j+1]=ar[j];
                j--;
            }
            ar[j+1]=key;
        }
        return ar;
    }

    static int[] selectionSort(int[] ar){
        for(int i=0;i<ar.length-1;i++){
            int min=i;
            for(int j=i+1;j<ar.length;j++){
                if(ar[j]<ar[min]){
                    min=j;
                }
            }
            int temp=ar[i];
            ar[i]=ar[min];
            ar[min]=temp;
        }
        return ar;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        //a=bubbleSort(a);
        //a=insertionSort(a);
        a=selectionSort(a);
        for(int i = 0;i<n;i++)
        System.out.print(a[i]+" ");
        sc.close();
    }
}
