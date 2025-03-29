package Module61;

import java.util.Scanner;

public class FindPath {
    static void printPath(int curr, int dest, String path){

        if (curr>dest) {
            return;
        }
        if(curr==dest){
            System.out.println(path);
            return;
        }
        
        printPath(curr+1, dest, path+"1");
        printPath(curr+2, dest, path+"2");
        printPath(curr+3, dest, path+"3");
        printPath(curr+4, dest, path+"4");
        printPath(curr+5, dest, path+"5");
        printPath(curr+6, dest, path+"6");

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N: ");
        int n=sc.nextInt();

        printPath(0,n,"");
        sc.close();
    }
}
