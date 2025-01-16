import java.util.*;
public class TransposeMatrix {
    // This mehtod is used to print the 2D Matrix
    static void print(int[][] arr) {
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }


    // Method to transpose the matrix
    static void transpose(int[][] arr){
        int n=arr.length; 
        int m=arr[0].length;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<m; j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row and coulumns respectively ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        System.out.println("Enter the element of the matrix");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Matrix is ");
        print(arr);

        transpose(arr);
        System.out.println("The Matrix after transposed is ");
        print(arr);
    }
}
