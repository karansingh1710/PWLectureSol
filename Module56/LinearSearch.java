package Module56;
import java.util.*;
public class LinearSearch {
    // Method to search the target element using linear search
    // Time complexity O(n)
    // Space Complexity O(1)
    static int searchElement(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements of array:");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Target Element to search");
        int target=sc.nextInt();
        System.out.println("The target element is found at "+searchElement(arr, target));
    }
}
