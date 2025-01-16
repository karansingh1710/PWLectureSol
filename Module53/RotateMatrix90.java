// Rotate a matrix 90 degrgree clockwise

import java.util.Scanner;

public class RotateMatrix90 {
    // Method to rotate matirx 90 degree clocwise
    // To rotate a matrix two steps need to be perform
    // 1. Transpose the matrix
    // 2. Swap matrix elements row wise
    // Time complexity O(n)
    // Space Complexity O(1)
    static void rotateMat90(int[][] arr){
        // This method is used to get the trasnposed matrix
        TransposeMatrix.transpose(arr);

        // Swap the elements of transposed matrix
        for(int[] a: arr){
            int n=a.length;
            for(int i=0; i<n/2; i++){
                int temp=a[i];
                a[i]=a[n-i-1];
                a[n-i-1]=temp;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row and column");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        System.out.println("Enter the matrix elements");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The matrix element is ");
        TransposeMatrix.print(arr);

        rotateMat90(arr);
        System.out.println("Rotated matrix is ");
        TransposeMatrix.print(arr);
    }
}
