package Moudle58AssignSol;

import java.util.Arrays;
import java.util.Scanner;

public class MaxVal {
    static int findMax(int[] arr, int idx){
        if(idx==arr.length-1) return arr[idx];
        return Math.max(arr[idx], findMax(arr, idx+1));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Maximum value is: "+findMax(arr,0));
        sc.close();
    }
}
