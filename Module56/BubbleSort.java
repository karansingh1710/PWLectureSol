package Module56;

import java.util.Scanner;

public class BubbleSort {
    // Method to print the array
    static void printArray(int[] arr){
        for(int el: arr){
            System.out.print(el+" ");
        }
        System.out.println();
    }

    // Method to sort the array using bubble sort
    // Time complexity O(n2)
    // Space Complexity O(1)
    static void bubbleSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Before Sorting the array is : ");
        printArray(arr);
        bubbleSort(arr);
        System.out.println("After Sorting the array using bubble sort : ");
        printArray(arr);
        sc.close();
    }
}
