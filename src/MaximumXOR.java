import java.util.*;
/*
    Maximum XOR of Two Numbers in an Array.
       Given an integer array nums, return the maximum result of nums[i] XOR nums[j], where 0 <= i <= j < n.
        Example :
	Input: nums = [3,10,5,25,2,8]
	Output: 28
	Explanation: The maximum result is 5 XOR 25 = 28

 */
public class MaximumXOR
{
    public void xor_operation(int[] array)
    {
        int maximum=0;
        for(int i=0;i< array.length;i++)
        {
            for(int j=i+1;j< array.length;j++)
            {
                // perform xor operation for the two element in an array
                int operation=array[i]^array[j];
                // if the xor result is greater than maximum then store that in maximum
                if(operation>=maximum)
                {
                    maximum=operation;
                }
            }
        }
        System.out.println("Maximum XOR: "+maximum);
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int length=scan.nextInt();
        int[] array=new int[length];
        System.out.println("Enter the array: ");
        for(int i=0;i<length;i++)
        {
            array[i]=scan.nextInt();
        }
        // Creating object to call method
        MaximumXOR maxi=new MaximumXOR();
        maxi.xor_operation(array);
    }
}
