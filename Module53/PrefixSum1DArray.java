import java.util.Arrays;
import java.util.Scanner;

public class PrefixSum1DArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements are\n"+Arrays.toString(arr));

        // This array will store the prefix sum
        // Space Complexity O(n)
        // Time Complexity O(n)
        int[] prefixSum=new int[n];
        for(int i=0; i<n; i++){
            if(i==0) prefixSum[i]=arr[i];
            else
            prefixSum[i]=prefixSum[i-1]+arr[i];
        }
        System.out.println("Prefix Sum of the Given array\n"+Arrays.toString(prefixSum));

        // Calculating the prefix sum in place
        // Space Complexity O(1)
        // Time Complexity O(n)
        for(int i=1; i<n; i++){
            arr[i]+=arr[i-1];
        }
        System.out.println("Prefix Sum of the Given array in place \n"+Arrays.toString(arr));
    }
}
