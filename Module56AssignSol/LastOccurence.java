package Module56AssignSol;
import java.util.*;
/*
 * Q2. Given an array and an integer “target”, return the last occurrence of “target” in the array. 
 * If the target is not present return -1.
 * Input 1: arr = [1 1 1 2 3 4 4 5 6 6 6 6] , target = 4
 * Output 1: 6
 * Input 2: arr = [2 2 2 6 6 18 29 30 30 30] , target = 15
 * Output 2: -1
 */
public class LastOccurence {
    
    static int findLastOccur(int[] arr, int target){
        int left=0,right=arr.length-1;
        int ans=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if (arr[mid]==target) {
                ans=mid;
                left=mid+1;
            }else if(arr[mid]<target){
                left=mid+1;
            }else right=mid-1;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements of array: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target element: ");
        int target=sc.nextInt();
        System.out.println(findLastOccur(arr, target));
        sc.close();
    }
}
