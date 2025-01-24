package Module56;

import java.util.Scanner;

public class BinarySearch {
    // Method to implement binary Search
    // Time Complexity O(logn)
    // Space Complexity O(1)
    static int binarySearch(int[] arr, int target){
        int low=0,high=arr.length-1;
        while (low<=high) {
            int mid=low+(high-low)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target element:");
        int target=sc.nextInt();

        System.out.println("The target is present on index "+binarySearch(arr, target));
        sc.close();
    }
}
