//Q8 : W.A.P to count the occurence of Vowels in a String .
package Java.Array.String;
import java.util.Scanner;
public class CountVowels_Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter a String as input: ");
       String str=sc.nextLine();
       int count=0;
       for(int  i=0;i<str.length();i++) {
        char cur=str.charAt(i);
        if(cur=='A'||cur=='E'||cur=='I'||cur=='O'||cur=='U'||cur=='a'||cur=='e'||cur=='i'||cur=='o'||cur=='u') {
            count++;
        }
       }
       System.out.println("The number of Vowels present in the String is : "+count);
        sc.close();
    }
}
