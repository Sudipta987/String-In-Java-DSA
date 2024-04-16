//Q1 : W.A.P to input a string from the user . Create a new String called 'result' in which you will replace the letter 'e' in original String with letter 'i'
package Java.Array.String;
import java.util.Scanner;
public class ReplaceEwithI_Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String as input: ");
        String  str=sc.nextLine();
        String result="";
        //1st way 
        result=str.replace('e','i');
        System.out.println("Result is : "+result);
         //2n way
        /*for(int i=0;i<str.length();i++) {
            if(str.charAt(i)=='e') {
                result+='i';
            }else{
                result+=str.charAt(i);
            }
        }
        System.out.println(result);
         */
         
        sc.close();
    }
}
