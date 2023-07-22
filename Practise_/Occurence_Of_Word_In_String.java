package Practise_;

public class Occurence_Of_Word_In_String {
    public static void main(String[] args) {
        String t="abcabcaaaabcabcaaabcbca";//aaabcabcaabcbabcaaabc
        String f="abc";
        int c1=0;
        // System.out.println(t.length()+" "+f.length());
        for (int i = 0; i < t.length()-f.length()+1; i++) {
            int k=i;
            int c=0;
            for (int j = 0; j < f.length(); j++) {
                // System.out.println(t.charAt(k)+"    "+f.charAt(j));
                if (t.charAt(k)==f.charAt(j)) {
                    c++;
                    // System.out.println("i    "+i+"   c   "+c);
                    if (c==f.length()) {
                        c1++;
                        // System.out.println("c1   "+c1);
                    }
                }
                else break;
                k++;
            }
        }
        System.out.println(c1);
    }
}
