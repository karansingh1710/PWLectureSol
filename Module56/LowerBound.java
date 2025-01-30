package Module56;

import java.util.Scanner;

public class LowerBound {

    // Method to find the lower bound of given array
    // Time Complexity : O(logN)
    // Space Complexity : O(1)
    static int findLowerBound(int[] arr, int target){
        int res=-1;
        int low=0,high=arr.length-1;
        while (low<=high) {
            int mid=low+(high-low)/2;
            if (target==arr[mid]) {
                res=mid;
                high=mid-1;
            }else if(arr[mid]>target) high=mid-1;
            else low=mid+1;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target element:");
        int target=sc.nextInt();
        System.out.println("The lower bound of given target is: "+findLowerBound(arr, target));
        sc.close();
    }
}
