import java.util.Scanner;

public class LargestElementIn2D {
    // Method to find the largest element in 2D array
    static int findLargest(int[][] mat){
        int max=Integer.MIN_VALUE;
       for(int[] arr: mat){
        for(int el: arr){
            max=Math.max(el, max);
        }
       }
       return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row size:");
        int row=sc.nextInt();
        System.out.println("Enter column size:");
        int col=sc.nextInt();

        int[][] arr=new int[row][col];

        System.out.println("Enter element of "+row+"x"+col+" array");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Array is");
        PrintNum.printMat(arr);
        System.out.println("Largest Element is "+findLargest(arr));
        sc.close();
    }
}
