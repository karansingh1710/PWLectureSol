package Module58;

import java.util.Scanner;

public class NthFibbonacci {
    // Method to calculate the nth term of fibbonaci series
    // Time complexity O(N!)
    // Space Complexity O(N)
    public static int findNthTerm(int n){
        if(n==1 || n==2){
            return 1;
        }
        else return findNthTerm(n-1)+findNthTerm(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Nth term: ");
        int n=sc.nextInt();
        System.out.println("The "+n+" th term is "+findNthTerm(n));
        sc.close();
    }
}
