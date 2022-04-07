import java.util.*;
/*

You are given two words. Find out the difference by outputting the characters
that are not present in the one but not in the other word. Example: “Something”, “else” output: ”omthing”

 */
public class WordDifference
{
    public void remove_difference(String string1,String string2)
    {
        String larger,smaller;
        // strings set to lower case. to remove lower and upper case character from to strings
        string1=string1.toLowerCase();
        string2=string2.toLowerCase();
        // find the largest string by comparing the length of two string
        if(string1.length()>=string2.length())
        {
            larger=string1;
            smaller=string2;
        }
        else
        {
            larger=string2;
            smaller=string1;
        }
        // checking whether the character is present in another string if yes then remove the specific character,
        //  concat and store in the larger string.
        for(int i=0;i<larger.length();i++)
        {
            for(int j=0;j<smaller.length();j++)
            {
                if(larger.charAt(i)==smaller.charAt(j))
                {
                    larger=larger.substring(0,i)+larger.substring(i+1);
                }
            }
        }
        System.out.println("Final Word: "+larger);
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String1: ");
        String string1= scan.next();
        System.out.println("Enter the String2: ");
        String string2=scan.next();
        // Creating object to call method
        WordDifference word=new WordDifference();
        word.remove_difference(string1,string2);
    }
}
