import java.util.Scanner;

public class DisplayMiddleElement {
    // Method to display the middle element of the matrix
    static void printMiddleElement(int[][] mat, int n){
       int rowMiddle=(n-1)/2;
       int colMiidle=rowMiddle;
       for(int i=0; i<n; i++){
        System.out.print(mat[i][rowMiddle]+" ");
       }
       for(int j=0; j<n; j++){
        if (j==colMiidle) continue;
        System.out.print(mat[colMiidle][j]+" ");
       }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the matrix:");
        int n=sc.nextInt();
        int[][] mat=new int[n][n];

        System.out.println("Enter matrix element:");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("2D Array is");
        PrintNum.printMat(mat);

        printMiddleElement(mat,n);
        sc.close();
    }
}
