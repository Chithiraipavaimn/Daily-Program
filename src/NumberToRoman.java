import java.util.*;
/*
   Integer to Roman
Symbol       Value
	I             1
	V             5
	X             10
	L             50
	C             100
	D             500
	M             1000

Example:
Input: num = 58
Output: "LVIII"
Explanation: L = 50, V = 5, III = 3.

 */
public class NumberToRoman
{
    public void conversionToRoman(int number1)
    {
        // Store the number in descending order in an array to get the roman in correct format
        int number_array[]={1000,900,500,400,100,90,50,10,9,5,1};
        // Give the letters that are equivalent to number_array like i=0 in number array=1000 then
        // in roman array the same ith position should be kept as M
        String roman[]={"M","CM","D","CD","C","XC","L","X","IX","V","I"};
        String romanLetters="";
        for (int i = 0; i < number_array.length; i++)
        {
            // Check the number is greater than (or) equal to number array if yes then subtract and add the roman to string.
            while (number1 >= number_array[i])
            {
                number1 =number1-number_array[i];
                romanLetters=romanLetters+roman[i];
            }
        }
        System.out.println("Answer After Converting Number to Roman: "+romanLetters);
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        // Creating object to call methods
        NumberToRoman number=new NumberToRoman();
        System.out.println("Enter the Number: ");
        int number1=scan.nextInt();
        // Calling methods to perform the operation.
        number.conversionToRoman(number1);
    }
}
