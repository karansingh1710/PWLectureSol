package Module56AssignSol;

import java.util.Scanner;

public class CounOne {
    // Method to count the frequency of 1
    // Space Compelxity : O(1)
    // Time Complexity : O(logn) , Because we are using here binary search approach
    static int count1(int[] arr){
        int low=0,high=arr.length-1;
        int idx=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if (arr[mid]==1) {
                idx=mid;
                high=mid-1;
            }else low=mid+1;
        }
        return idx==0?0:arr.length-idx;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements :");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Count of One is "+count1(arr));
        sc.close();
    }
}
