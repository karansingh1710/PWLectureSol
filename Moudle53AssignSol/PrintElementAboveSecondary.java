import java.util.Scanner;

public class PrintElementAboveSecondary {
    // Method to print the element above the secondary matrix
    static void printSecondaryElement(int[][] mat){
        int n=mat.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-1-i; j++){
                System.out.print(mat[i][j]+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of square matrix");
        int n=sc.nextInt();
        int[][] mat=new int[n][n];

        System.out.println("Enter the matrix element");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enputted Matrix");
        PrintNum.printMat(mat);
        // Calling the method to print the element above the seconday diagonal
        System.out.println("Elements are:");
        printSecondaryElement(mat);
    }
    
}