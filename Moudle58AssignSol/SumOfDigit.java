package Moudle58AssignSol;

import java.util.Scanner;

public class SumOfDigit {
    // Method to rev num
    // static int rev(int num, int result){
    //     if (num==0) {
    //         return result;
    //     }
    //     else {
    //         int rem=num%10;
    //         result=result*10+rem;
    //         return rev(num/10,result);
    //     }
    // }
    // Method to find the sum of digit
    static int digitSum(int num){
        if(num<=9) return num;
        else return num%10+digitSum(num/10);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number : ");
        int num=sc.nextInt();
        System.out.println("The sum of digit is "+digitSum(num));
        System.out.println("Reversed Num is "+rev(num,0));
        sc.close();
    }
}