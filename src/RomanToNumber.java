import java.util.*;
/*
Roman to Integer
	Symbol       Value
	I             1
	V             5
	X             10
	L             50
	C             100
	D             500
	M             1000

Example:
Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3
*/
public class RomanToNumber
{
    public int integerConversion(char ch)
    {
        if (ch == 'I')
            return 1;
        if (ch == 'V')
            return 5;
        if (ch == 'X')
            return 10;
        if (ch == 'L')
            return 50;
        if (ch == 'C')
            return 100;
        if (ch == 'D')
            return 500;
        if (ch == 'M')
            return 1000;
        return 0;
    }
    public void conversionToNumbers(String roman_Letters)
    {
        int answer=0;
        for(int i=0;i<roman_Letters.length();i++)
        {
            // Calling  integerConversion method to get the value for the specific roman letters
            int value1=integerConversion(roman_Letters.charAt(i));
            if(i+1<roman_Letters.length())
            {
                // To check next letter is greater than first letter
                int value2=integerConversion(roman_Letters.charAt(i+1));
                // If value1 is greater than (or) equal to value2 then simply add value1 to the answer
                if(value1>=value2)
                {
                    answer=answer+value1;
                }
                // Else subtract the greatest number value2 from value1 and add the subtracted number to the answer
                // and increase the i value
                else
                {
                    answer=answer+value2-value1;
                    i++;
                }
            }
            // If it is greater than the given string length while checking i+1 then it directly add the answer with its value1.
            else
            {
                answer=answer+value1;
            }
        }
        System.out.println("Answer After Converting Roman to Number: "+answer);
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        // Creating object to call methods
        RomanToNumber roman=new RomanToNumber();
        System.out.println("Enter the Roman Letters: ");
        String roman_Letters=scan.next();
        // Calling methods to perform the operation.
        roman.conversionToNumbers(roman_Letters);

    }
}
