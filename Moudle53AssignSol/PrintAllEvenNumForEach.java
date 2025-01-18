// Q2: Write a program to traverse over the elements of the array using for each loop and print all even elements.

// Input 1: arr[] = {34,21,54,65,43}
// Output 1: 34 54
// Input 2: arr[] = {4,3,6,7,1}
// Output 2: 4 6

import java.util.*;
public class PrintAllEvenNumForEach {
    // This method is used to print all the even number using for each loop
    // Time complexity is O(n)
    // Space Complexity is O(1)
    static void printAllEven(int[] arr){
        for(int i: arr){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n=sc.nextInt();

        int[] arr=new int[n];

        System.out.println("Enter the elements of the array:");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        printAllEven(arr);
    }
}
