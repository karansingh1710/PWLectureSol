package Moudle58AssignSol;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfArray {
    static int findSum(int[] arr, int idx){
        if (idx==arr.length-1) return arr[idx];
        return arr[idx]+findSum(arr,idx+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elments of array");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Total sum: "+findSum(arr, 0));
        sc.close();
    }
}
