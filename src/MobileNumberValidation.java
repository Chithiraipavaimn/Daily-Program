import java.util.*;
import java.util.regex.Pattern;

/*

Phone Number Validation.

 */
public class MobileNumberValidation
{
    public void regex_operation(String mobile_number)
    {
        // regex expression to check whether it is valid mobile number
        boolean answer=Pattern.matches("[6789]{1}[0-9]{9}",mobile_number);
        // if it is true then it prints the mobile number is valid
        if(answer)
        {
            System.out.println("Given mobile number is valid.");
        }
        else
        {
            System.out.println("Given mobile number is not valid.");
        }
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Mobile Number: ");
        String mobile_number= scan.next();
        // Creating object to call the method
        MobileNumberValidation mobile=new MobileNumberValidation();
        mobile.regex_operation(mobile_number);
    }
}
