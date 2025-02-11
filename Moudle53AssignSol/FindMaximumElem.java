// Q3: Write a program to calculate the maximum element in the array.
// Input 1: arr[] = {34,21,54,65,43}
// Output 1: 65

// Input 2: arr[] = {4,3,6,7,1}
// Output 2: 7

import java.util.Scanner;

public class FindMaximumElem {
    // Method to find the maximum element in the array
    // Time complexity is O(n)
    // Space Complexiy is O(1)
    static int findMax(int[] arr){
        int max=Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>max) max=arr[i];
        }

        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter the elements of the array :");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("The maximum element is "+findMax(arr));
        sc.close();
    }
}
