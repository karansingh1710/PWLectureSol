public class ArrayCreation{
    public static void main(String[] args) {
        //First way when we know the element of the array
        int[] arr={1,2,3,4,5,6};// Integer type array
        int arr1[]={1,2,34,5,6}; // Integer type array in c format
        int []arr2={1,23,4,5}; // Also a valid syntax of defining the array
        // []int arr3={1,2,3}; Not a valid syntax 

        // accesing the element of the array
        System.out.println(arr[0]); // Array indexing start from the zero
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[5]); // Last element of the array is n-1 (n is the length of the array)

    }
}