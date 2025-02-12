package Module56AssignSol;
import java.util.*;
// Q1. Given an array. FInd the number X in the array. If the element is present, return the index of the element,
// else print “Element not found in array”. Input the size of array, array from user and the element X from user.
// Use Linear Search to find the element.
public class SearchElement {
    // Mehtod to find the arrray element 
    static void findElement(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                System.out.println("Element found at "+i);
                return;
            }
        }
        System.out.println("Element not found in array");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements that yow want to add : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched in array : ");
        int target=sc.nextInt();
        findElement(arr, target);
        
        sc.close();
    }
}
