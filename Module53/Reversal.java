public class Reversal {
    // Print the array
    static void print(int arr[]){
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    // This method will reverse the array in place
    // Time complexity is O(n)
    // Sapce complexity is O(1)
    static void reverseInSpace(int[] arr){
        int n=arr.length;
        for(int i=0; i<n/2; i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
    }

     // This method will reverse the array in place
    // Time complexity is O(n)
    // Sapce complexity is O(n) because a new array of the same size is created

    static int[] reverse(int[] arr){
        int n=arr.length;
        int copy[] =new int[n];
        for(int i=0; i<n; i++){
            copy[i]=arr[n-i-1];
        }
        return copy;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println("Before Reverse ");
        print(arr);

        System.out.println("After Reverse using Extra Sapce");
        print(reverse(arr));

        reverseInSpace(arr);
        System.out.println("After Reverse In palce");
        print(arr);

    }
}
