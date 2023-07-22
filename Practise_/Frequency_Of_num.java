package Practise_;

public class Frequency_Of_num {
    public static void main(String[] args) {
        int a[]={1,2,8,3,2,2,2,5,1};
        int n=a.length;
        // System.out.println(n);
        int freq[]=new int[n];
        int visit=-1;
        for(int i=0;i<n;i++){
            int count=1;
            for(int j=i+1;j<n;j++){
                if (a[i]==a[j]) {
                    count++;
                    freq[j]=visit;
                }
            }
            if(freq[i]!=visit) 
                freq[i]=count;
        }

        for(int i=0;i<n;i++)
        System.out.println(freq[i]);

    }//end of main
}
