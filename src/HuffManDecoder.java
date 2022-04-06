import java.util.*;
/*
HuffmanDecoder
Here we will not make huffman code, but we'll be decoding one
The dictionary is already known, it consists of only five coded letters.
A → 0
B → 10
C → 110
D → 1110
E → 1111
You are given the encoded string, return the original one.
Eg.
Input 1101110 Output:CD
Input 11111100 Output: ECA

 */
public class HuffManDecoder
{

    public void decoder(String binary)
    {
                String answer ="";
                String result = "", temp = "";
                // convert binary to char array
                char str[]=binary.toCharArray();
                for (int i=0;i<str.length;i++)
                {
                    // store one by one in result and check whether the result is present in switch case or not if not add another character
                    result = temp+str[i];
                    switch(result)
                    {
                    case "0":
                        answer=answer+"A";
                        // if it is present then empty the string result and temp to add new character from first
                        result = "";
                        temp = "";
                        break;
                    case "10":
                        answer=answer+"B";
                        result = "";
                        temp = "";
                        break;
                    case "110":
                        answer=answer+"C";
                        result = "";
                        temp = "";
                        break;
                    case "1110":
                        answer=answer+"D";
                        result = "";
                        temp = "";
                        break;
                    case "1111":
                        answer=answer+"E";
                        result = "";
                        temp = "";
                        break;
                    default:
                        temp=temp+str[i];
                        break;
                }
            }
        System.out.println(answer);
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Binary Number: ");
        String binary=scan.next();
        // Creating object to call methods
        HuffManDecoder huff=new HuffManDecoder();
        huff.decoder(binary);
    }
}
