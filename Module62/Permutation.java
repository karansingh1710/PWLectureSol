package Module62;
import java.util.ArrayList;

public class Permutation {
    static void permute(int[] nums,  ArrayList<Integer> tempAns, ArrayList<ArrayList<Integer>> result){
        // Base case
        if (tempAns.size()==nums.length) {
            result.add(new ArrayList<>(tempAns));
            return;
        }
        // Travser through each element of the array
        for(int i=0; i<nums.length; i++){
            // Make sure that there is no repetion of the any element
            if(tempAns.contains(nums[i])) continue;
            // Add the current element in the tempAns
            tempAns.add(nums[i]);
            // Call the function for next combination
            permute(nums, tempAns, result);
            // Remove the last element from the answer for the other combination
            tempAns.remove(tempAns.size()-1);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2};
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        permute(arr, new ArrayList<>(), result);
        
        for (ArrayList<Integer> arrayList : result) {
            System.out.println(arrayList);
        }
    }
}
