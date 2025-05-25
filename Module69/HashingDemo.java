import java.util.Scanner;

public class HashingDemo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int[] hashTable=new int[10];
        int num;

        System.out.println("Enter the elemnts from 0 - 9 and I will count the frequencies.\nEnter -1 to stop.");
        do{
            num=sc.nextInt();
            if(num>-1 && num<10){
                hashTable[num]+=1;
            }
        }while(num>-1);

        System.out.println("Total frequency count from 0 - 9 is");
        for(int i=0; i<10; i++){
            System.out.format("%d count %d%n",i,hashTable[i]);
        }

        sc.close();
    }
}