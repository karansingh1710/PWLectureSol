package Module58;

import java.util.Scanner;

public class StairCaseProblem {
    // Method to count the number of ways to reach the last stair

    static int countWays(int n){
        if(n==1 || n==2){
            return n;
        }
        else return countWays(n-1)+countWays(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of stairs: ");
        int n=sc.nextInt();
        System.out.println("Total ways to reach on top stair: "+countWays(n));
        sc.close();
    }
}
