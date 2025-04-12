package Module62;

import java.util.ArrayList;

public class CombinationSum {

    static void findCom(int[] arr, int target, int idx,ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> ans){
        if(target<0){
            return;
        }
        else if (target==0) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i=idx; i<arr.length; i++){
            temp.add(arr[i]);
            findCom(arr, target-arr[i], idx, temp, ans);
            temp.remove(temp.size()-1);
        }
    }


    public static void main(String[] args) {
        int[] arr={2,3,6,7};
        int target=7;
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        findCom(arr, target, 0, new ArrayList<>(), result);

        for (ArrayList<Integer> arrayList : result) {
            System.out.println(arrayList);
        }
    }
    
}
