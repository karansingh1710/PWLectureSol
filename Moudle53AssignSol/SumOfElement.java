// Q1: Write a program to print the sum of all the elements present on even indices in the given array.
// Input 1: arr[] = {3,20,4,6,9}
// Output 1: 16

// Input 2: arr[] = {4,3,6,7,1}
// Output 2: 11
import java.util.*;
public class SumOfElement{
    // Method to calculate the sum of elements that present on even indices
    // Time complexity O(n)
    // Space complexity O(1)
    static int calculateSum(int[] arr){
        int sum=0;
        for(int i=0; i<arr.length; i+=2){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The sum is "+calculateSum(arr));
    }
}