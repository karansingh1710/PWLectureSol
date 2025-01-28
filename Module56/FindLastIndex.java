package Module56;

import java.util.Scanner;

public class FindLastIndex {
    // Method to find the last index of given element
    static int lasIndex(int[] arr, int target){
        for(int i=arr.length-1; i>=0; i--){
            if(target==arr[i]) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        System.out.println("Enter array element");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target element");
        int target=sc.nextInt();
        System.out.println("The last index of element "+target+" is present on "+lasIndex(arr,target));
        sc.close();
    }
}
