package Module62;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PrintSubsequences {
    static void printSequence(int[] arr, int idx,ArrayList<Integer>  tempArr){
        if(idx==arr.length){
            System.out.println(tempArr);
            return;
        }
        printSequence(arr, idx+1, tempArr);
        tempArr.add(arr[idx]);
        printSequence(arr, idx+1,tempArr);
        tempArr.remove(tempArr.size()-1);

    }
    static void subSequences(int idx, String str, String ans){
        if(idx==str.length()){
            System.out.println(ans);
            return;
        }
        subSequences(idx+1, str, ans);
        subSequences(idx+1, str, ans+str.charAt(idx));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String : ");
        String str=sc.next();
        subSequences(0,str,"");
        sc.close();

        printSequence(new int[]{1,2,3}, 0, new ArrayList<>());
    }
}
