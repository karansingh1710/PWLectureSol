public class MissingArrayElement{
    // Method to find the missing array element. The element of the array is in seqeunce format
    // Time complexity O(n)
    // Space complexity O(1)
    static int findMissingElem(int[] arr){
        int n=arr.length;
        int nthSum=((n+1)*(n+2))/2;
        int totalSum=0;
        for(int i: arr){
            totalSum+=i;
        }
        return nthSum-totalSum;
    }
    public static void main(String[] args){
        int[] arr={1,2,4,5,7,6};
        System.out.println("Array element is ");
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println("\nMissing Array elment is "+findMissingElem(arr));
    }
}