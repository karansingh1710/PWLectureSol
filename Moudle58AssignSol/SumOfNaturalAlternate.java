package Moudle58AssignSol;
// //*
// Q2: Given a number n. Find the sum of natural numbers till n but with alternate signs.
// That means if n = 5 then you have to return 1-2+3-4+5= 3 as your answer.
// Constraints: 0<=n<=le6
// Input1: n = 10
// Output 1:-5
// Explanation: 1-2+3-4+5-6+7-8+9-10=-5
// Input 2: n = 5
// Output 2:3

import java.util.Scanner;

// */
public class SumOfNaturalAlternate {
    
    static int alternateSum(int n){
        if(n==1){
            return 1;
        }else if(n%2==0){
            return alternateSum(n-1)-n;
        }else{
            return alternateSum(n-1)+n;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num : ");
        int n=sc.nextInt();
        System.out.println("Result : "+alternateSum(n));
        sc.close();
    }
}