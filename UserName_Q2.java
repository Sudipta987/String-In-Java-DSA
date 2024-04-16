//Q2 : Input an email from the user.You have to create a user name from the email by deleting
//the part that comes after '@' .
package Java.Array.String;
import java.util.Scanner;
public class UserName_Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your mail address: ");
        String email=sc.nextLine();
        String userName="";
        for(int i=0;i<email.length();i++) {
            if(email.charAt(i)=='@') {
                break;
            }else{
                userName+=email.charAt(i);
            }
        }
        userName=userName.toUpperCase();
        System.out.println("Your User Name is: "+userName);
        sc.close();
    }
}
