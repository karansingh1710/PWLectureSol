package Module56;
import java.util.*;

public class HigherBound{
    // Method to find the last index of the given sorted array
    static int findHighestBound(int[] arr, int target){
        int low=0,high=arr.length-1;
        int res=-1;
        while (low<=high) {
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                res=mid;
                low=mid+1;
            }else if(arr[mid]>target) high=mid-1;
            else low=mid+1;

        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements of the array:");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target element:");
        int target=sc.nextInt();
        System.out.println("The last index of given element is "+findHighestBound(arr, target));
        sc.close();
    }
}