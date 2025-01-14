public class SpaceComplex {
    // This example demonstrate the space complexity 
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};

    }

    // Copy Array
    // Space Complexity is O(n). Becuase a new array of the same lenght is created
    // Time complexity is O(n). Becuase the loop runs n times
    static int[] copy(int[] arr){
        int[] ans=new int[arr.length];
        for(int i=0; i<arr.length; i++){
            ans[i]=arr[i];
        }
        return ans;
    }
}
