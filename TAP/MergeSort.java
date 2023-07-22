package TAP;

public class MergeSort {
    public static void main(String[] args) {
        /* int[] a={5,9,13,45,75};
        int[] b={1,10,20}; */
        int[] a={3,5,9,12,15};
        int[] b={1,6,8};
        int[] c=new int[a.length+b.length];
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k]=a[i];
                k=k+1;
                i++;
            }
            else{
                c[k]=b[j];
                k++;
                j++;
            }
        }
        while(i<a.length){
            c[k]=a[i];
            k++;
            i++;
        }
        while(j<b.length){
            c[k]=b[i];
            k++;
            j++;
        }
        for(int d=0;d<c.length;d++){
            System.out.print(c[d]+"  ");
        }
    }
}
