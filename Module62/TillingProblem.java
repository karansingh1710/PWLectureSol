package Module62;

import java.util.Scanner;

public class TillingProblem {
    static int getWays(int n){
        if(n<=3) return n;
        else return getWays(n-1)+getWays(n-2);
    }
    public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size of the board ");
    int n=sc.nextInt();
    System.out.println("The size of the board is 2 X "+n);
    System.out.println("The total ways to tile the board are: "+getWays(n));
    sc.close();
    }
}
