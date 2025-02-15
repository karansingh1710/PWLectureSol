package Module56AssignSol;

import java.util.Scanner;

public class FindDuplicate {

    // Method to find the index of the target element
    // Space Complexity : O(1)
    // Time Complexity : O(logN)
    static int findElement(int[] arr, int target, boolean bool){
        int low=0,high=arr.length-1;
        int idx=0;
        while (low<=high) {
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                idx=mid;
                if(bool) low=mid+1;
                else high=mid-1;
            }
            else if(arr[mid]<target) low=mid+1;
            else high=mid-1;
        }
        return idx;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements : ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target element : ");
        int target=sc.nextInt();
        System.out.println(findElement(arr, target, true)-findElement(arr, target, false)+1);
        sc.close();
    }
}
