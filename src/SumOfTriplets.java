import java.util.*;
/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k
nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.
Example:
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]

 */
public class SumOfTriplets
{
    public void tripletOperation(int[] array)
    {
        int i,j,k;
        int[] answer=new int[3];
        System.out.println("Sum of Triplets: ");
        // hashset is used because duplicate will not allow in hashset
        HashSet<List<Integer>> hash=new HashSet<>();
        for(i=0;i<array.length-2;i++)
        {
            for(j=i+1;j< array.length-1;j++)
            {
                for(k=j+1;k< array.length;k++)
                {
                    if(array[i]+array[j]+array[k]==0)
                    {
                       if(i!=j && i!=k && j!=k)
                       {
                           ArrayList<Integer> arr = new ArrayList<>();
                           arr.add(array[i]);
                           arr.add(array[j]);
                           arr.add(array[k]);
                           // sort the arraylist
                           Collections.sort(arr);
                           // add them to hash set while adding to hash set it will automatically remove the duplicate set
                           hash.add(arr);
                       }
                    }
                }
            }
        }
        System.out.println(hash);
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
        // Creating object to call methods
        SumOfTriplets sum=new SumOfTriplets();
        sum.tripletOperation(array);
    }
}
