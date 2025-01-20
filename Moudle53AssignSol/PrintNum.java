// Q1: Take m and n input from the user and m * n integer inputs from user and print the following:
// number of positive numbers
// number of negative numbers
// number of odd numbers
// number of even numbers
// number of 0.

import java.util.Scanner;

public class PrintNum {
    // Method to print the Matrix
    public static void printMat(int[][] mat){
        for(int[] arr: mat){
            for(int i: arr){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    // Mehtod to find the positive, negative, odd, even and zero
    static void findNegPosOddEvenZero(int[][] mat){
        int posCount=0,negCount=0,oddCount=0,evenCount=0,zeroCount=0;

        for(int[] arr: mat){
            for(int el:arr){
                if(el>=0){
                    posCount++;
                    if(el==0){
                        zeroCount++;
                        evenCount++;
                    } 
                    else if(el%2==0) evenCount++;
                    else oddCount++;
                }
                else {
                    negCount++;
                    if(el%2==0) evenCount++;
                    else oddCount++;
                }
            }
        }
        System.out.println("Number of positive no "+(posCount-zeroCount));
        System.out.println("Number of negative no "+negCount);
        System.out.println("Number of odd number "+oddCount);
        System.out.println("Number of even number "+evenCount);
        System.out.println("Number of zero "+zeroCount);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter m and n ");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] mat=new int[m][n];
        System.out.println("Enter "+m+"*"+n+" Integer");

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                mat[i][j]=sc.nextInt();
            }
        }
        
        printMat(mat);
        findNegPosOddEvenZero(mat);
    }
}
