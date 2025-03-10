package Module58;

import java.util.Scanner;

public class PowerCal {

    // Method to calculate the number of given power
    static int pow(int n, int p){
        if(p==1){
            return n;
        }
        else return n*pow(n, p-1);
    }
    // Optimized approach to calculate the power
    static int calPow(int n, int p){
        if (p==1) {
            return n;
        }
        else{
            int result=calPow(n, p/2);
            int finalResult=result*result;
            if(p%2==0) return finalResult;
            else return n*finalResult;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        System.out.println("Enter power");
        int p=sc.nextInt();
        System.out.println(pow(n,p));
        System.out.println(calPow(n, p));
        sc.close();
    }
}
