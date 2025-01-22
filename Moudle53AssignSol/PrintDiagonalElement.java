import java.util.Scanner;

public class PrintDiagonalElement {

    // Method to print the element of diagonal
    static void printdiagonal(int[][] mat){
        int n=mat.length;
        System.out.println("Digonal Element are:");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j || i+j==n-1){
                    System.out.print(mat[i][j]+" ");
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the square matrix: ");
        int n=sc.nextInt();
        int[][] matrix=new int[n][n];
        System.out.println("Enter the matrix element:");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                matrix[i][j]=sc.nextInt();
                
            }
        }
        
        System.out.println("Enputted Matrix is");
        PrintNum.printMat(matrix);

        printdiagonal(matrix);

        sc.close();
    }
}
