//Q5 : W.A.P to find Most Frequence character in the String .
package Java.Array.String;
import java.util.Scanner;
public class MostFrequentChar_Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String as input : ");
        String str=sc.nextLine();
        int mostT=0;
        char mostF=str.charAt(0);
        for(int i=0;i<str.length();i++) {
            char  temp=str.charAt(i);
            int count=0;
         for(int j=0;j<str.length();j++) {
            if(temp==' ') {
                continue;
            }
            else if(temp==str.charAt(j)) {
                count++;
            }
            if(mostT<count) {
                mostT=count;
                mostF=temp;
             }
         }
        
        }
        System.out.println("Most Frequence Character in the String is : '"+mostF+"' and occurence time is : "+mostT);
        sc.close();
    }
}
