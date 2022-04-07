import java.util.*;
import java.util.regex.Pattern;

/*

Email Id Validation

 */
public class EmailValidation
{
    public void regex_operation(String email_id)
    {
        // regex expression to check whether it is valid email id
        boolean answer= Pattern.matches("^[a-zA-Z0-9]+\\.?[a-zA-Z0-9]+@[a-z]+\\.?[a-z]{2,3}+\\.[a-z]{2,3}",email_id);
        // if it is true then it prints the email id is valid
        if(answer)
        {
            System.out.println("Given Email Id is Valid");
        }
        else
        {
            System.out.println("Given Email Id is not Valid");
        }
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String email_id=scan.next();
        // creating object to call method
        EmailValidation email=new EmailValidation();
        email.regex_operation(email_id);
    }
}
