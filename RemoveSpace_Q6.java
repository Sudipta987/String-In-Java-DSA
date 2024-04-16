//Q6 : W.A.P to Remove Blank Space from a String  .
package Java.Array.String;
import java.util.Scanner;
public class RemoveSpace_Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String as input : ");
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder(str);
        for(int i=0;i<sb.length();i++) {
            if(sb.charAt(i)==' ') {
                sb.delete(i,i+1);
            }
        }
        System.out.println("After Removing  Blank Spaces from the String the String is : "+sb);
        sc.close();
    }
}
