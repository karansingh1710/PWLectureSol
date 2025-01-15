public class DuplicateElment {
    // Mehtod to find the duplicate elment in java
    // Time complexity is O(n)
    // Space Complexity is O(1)
    static int findDuplicate(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
            if (arr[i]==arr[j]) {
                return arr[i];
            }
        }
    }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,5,6,7,7};
        System.err.println(findDuplicate(arr));
    }
}
