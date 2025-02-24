package Module57;

import java.util.Scanner;

public class PerfectSquare {
    public static int findPerfect(int n){
        int low=0,high=n/2;
        int ans=-1;
        while (low<=high) {
            int mid=low+(high-low)/2;
            if(mid*mid==n){
                return mid;
            }
            else if(mid*mid<n){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=sc.nextInt();
        System.out.println(findPerfect(n));
        sc.close();
    }
}
