package TAP;

import java.util.Scanner;

public class Funny {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str =sc.nextLine();
        int flag=0;
        for(int i=0 , j=str.length()-1 ; i<j ; i++,j--){
            
            if(Math.abs(str.charAt(i)-str.charAt(i+1))==Math.abs(str.charAt(j)-str.charAt(j-1))){
                flag=1;
            }
            else{
                flag=0;
                break;
            }
        }
        if(flag==1)
        System.out.println("Funny");
        else
        System.out.println("Not Funny");
        
        sc.close();
    }
}
