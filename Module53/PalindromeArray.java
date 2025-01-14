public class PalindromeArray {
    // Method to check the palindrome array using two pointer Approach
    // Time Complexity O(logn)
    // Space Complexity O(1)
    static void checkPalin1(int[] arr){
        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[i]!=arr[j]){
                System.out.println("Given Array is not Plaindrome.");
                return;
            }
            else{
                i++;
                j--;
            }
        }
        System.out.println("Given Array is Palindorme.");
    }

    // Method to check the Palindrome using reverse then compare
    // Time Complexity O(n)
    // Space Complexity O(n)
    static void checkPalin2(int[] arr){
        int[] copy=new int[arr.length];
        int n=arr.length-1;
        for(int i=0; i<arr.length; i++){
            copy[n-i]=arr[i];
        }
        for(int i=0; i<arr.length; i++){
            if(copy[i]!=arr[i]){
                System.out.println("Given Array is not Palindrome.");
                return;
            }
        }
        System.out.println("Given Array is Palindrome.");
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,2,1,6};

        System.out.println("Using First Mehtod checkPalin1():");
        checkPalin1(arr);

        System.out.println("Using Second Method checkPalin2():");
        checkPalin2(arr);
    }
}
