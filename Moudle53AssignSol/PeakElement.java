// Q5: Given an array. Find the first peak element in the array. A peak element is an element that is greater than
// its just left and just right neighbor.
// Input 1: arr[] = {1,3,2,6,5}
// Output 1: 6
// Input 2: arr[] = {1 4,7,3,2,6,5}
// Output 2: 7

import java.util.Scanner;
public class PeakElement {
    // Mehtod to find the first peak element in the given array
    // Time complexity O(n)
    // Space Complexity O(1)
    static int findPeak(int[] arr){
        for(int i=1; i<arr.length-1; i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) return arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Peak element is "+findPeak(arr));
    }
}