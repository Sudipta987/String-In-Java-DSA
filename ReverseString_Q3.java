//Q3 : W.A.P to Reverse a String using a String Builder.
package Java.Array.String;
import java.util.Scanner;
public class ReverseString_Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String as input: ");
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder(str);
        int n=sb.length();
        for(int i=0;i<n/2;i++) {
            char first=sb.charAt(i);
            char last=sb.charAt(n-i-1);
            sb.setCharAt(i,last);
            sb.setCharAt(n-i-1,first);
        }
        System.out.println("Reverse String is : "+sb);
        sc.close();
    }
}
