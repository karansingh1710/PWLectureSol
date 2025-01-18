// Q4: Write a program to find out the second largest element in a given array.
// Input 1: arr[] = {34,21,54,65,43}
// Output 1: 54

// Input 2: arr[] = {4,3,6,7,1}
// Output 2: 6
import java.util.Scanner;

public class SecondLargest{
    // Method to find the second largest element
    // Time Compleixty O(n)
    // Space Complexity O(1)
    static void findSecondLargest(int[] arr){
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
              secondMax=max;
                max=arr[i];
            }else if(arr[i]>secondMax && arr[i]!=max){
                secondMax=arr[i];
            }
        }
        System.out.println("Largest Element is "+max);
        if(secondMax!=Integer.MIN_VALUE) System.out.println("Second Largest element is "+secondMax);
        else System.out.println("There is no second largest element present. All elements are same.");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        findSecondLargest(arr);
    }
}