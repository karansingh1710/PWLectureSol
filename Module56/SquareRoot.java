package Module56;

import java.util.Scanner;

public class SquareRoot {
    // method to find the square root of given number
    // Time complexity O(n)
    // Space Complexity O(1)
    static int findSquareRoot(int num){
        int low=0,high=num;
        int res=-1;
        while (low<=high) {
            int mid=low+(high-low)/2;
            if (mid*mid==num) return mid;
            else if(mid*mid<num){
                res=mid;
                low=mid+1;
            }
            else high=mid-1;
           
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num:");
        int num=sc.nextInt();
        int sqrt=findSquareRoot(num);
        System.out.println("The square root of given num is "+sqrt);
        sc.close();
    }
}
