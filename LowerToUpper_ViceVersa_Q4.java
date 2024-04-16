//Q4 : W.A.P to change Lower case to upper case & vice versa.
package Java.Array.String;
import java.util.Scanner;
public class LowerToUpper_ViceVersa_Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String as input: ");
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder("");
       //1st way 
        /*  for(int i=0;i<str.length();i++) {
            char temp=str.charAt(i);
            if(temp>='A'&&temp<='Z') {
                sb.append((char)(temp+32));
            }else if(temp>='a'&&temp<='z') {
                sb.append((char)(temp-32));
            }else if(temp==' ') {
                sb.append(temp);
            }else{
                sb.append(temp);
            }
        }
       */
      //2nd way
      for(int i=0;i<str.length();i++) {
        char temp=str.charAt(i);
        if(Character.isUpperCase(temp)) {
            sb.append(Character.toLowerCase(temp));
        }else if(Character.isLowerCase(temp)) {
            sb.append(Character.toUpperCase(temp));
        }else if(temp==' ') {
            sb.append(temp);
        }else{
            sb.append(temp);
        }
    }
        System.out.println("After changing the case of the string : "+sb);
        sc.close();
    }
}
