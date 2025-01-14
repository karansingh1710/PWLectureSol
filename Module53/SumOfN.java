import java.util.Scanner;

public class SumOfN{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N :");
        int n=sc.nextInt();
        
        // Approch 1 -> Using a loop 
        int sum1=0;
        for(int i=1; i<=n; i++){
            sum1+=i;
        }
        System.out.println("Using approach 1 Sum of "+n+" is "+sum1);
        // Approach 2 -> Using a mathematical Formula
        int sum2=0;
        sum2=(n*(n+1))/2;
        System.out.println("Using approach 2 Sum of "+n+" is "+sum2);

    }
} 