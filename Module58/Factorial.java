package Module58;

import java.util.Scanner;

public class Factorial {
    static int fact(int n){
        if(n<=1) return 1;
        else return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Factorial of "+n+": "+fact(n));
        sc.close();
    }
}
