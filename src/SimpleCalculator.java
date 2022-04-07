import java.util.*;
/*
Simple Calculator
Given a string s which represents an expression, evaluate this expression and return its value.
Example:
Input: s = "3+2*2"
Output: 7

 */
public class SimpleCalculator
{
    public void calculation(String string)
    {
        int sum=0,value1=0,value2=0;
        for(int i=0;i<string.length();i++)
        {
            if(string.charAt(i)=='/')
            {
                int j=i,k=i;
                String str = "", str1 = "";
               while((string.charAt(j)>='0' && string.charAt(j)<='9')||(string.charAt(k)>='0' && string.charAt(k)<='9'))
               {
                   j--;
                   k++;
                   if(string.charAt(j)!='+' || string.charAt(j)!='*' || string.charAt(j)!='/' || string.charAt(j)!='-')
                   {
                       str = str + string.charAt(j);
                   }
                   if(string.charAt(j)!='+' || string.charAt(j)!='*' || string.charAt(j)!='/' || string.charAt(j)!='-')
                   {
                       str1 = str1 + string.charAt(k);
                   }
               }
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String string=scan.next();
        // Creating object to call method
        SimpleCalculator simple=new SimpleCalculator();
        simple.calculation(string);
    }
}
