//Q7 : W.A.P to find the salted form fo a Password entered by user if the salt is "123" & added at the end.
package Java.Array.String;
import java.util.Scanner;
public class SaltedForm_Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Password: ");
        String pass=sc.nextLine();
        String salt="123";
        //1st way
       // String newPass=pass+salt;
       //2nd  way
      String newPass= pass.concat(salt);
        System.out.println("Now the Salted form of the Password is : "+newPass);
        sc.close();
    }
}
