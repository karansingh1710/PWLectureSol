import java.util.*;
// Time complexity is O(n)
// Space Complexity is O(1)
public class SumOfRectangelMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[][] mat={
            {1,1,1,1},
            {1,1,1,1},
            {1,1,1,1},
            {1,1,1,1}
        };

        System.out.println("Enter r1 and c1 in range 0-3 )");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        System.out.println("Enter r2 and c2 in range 0-3 )");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int sum=0;
        for(int i=r1; i<=r2; i++){
            for(int j=c1; j<=c2; j++){
                sum+=mat[i][j];
            }
        }
        System.out.println("The Sum is "+sum);
    }
}
