import java.util.Scanner;

public class TechNumber {
    static int countDigit(int n){
        int dig=0;
        while(n!=0){
            dig++;
            n/=10;
        }
        return dig;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int dig=countDigit(n);
        if(dig%2==0){
        int pow=(int)Math.pow(10, dig/2);
        int fp=n/pow;
        int sp=n%pow;

        int sqSum=(int)Math.pow(fp+sp, 2);

        if(sqSum==n){
            System.out.println(n+ " Tech number");
        }else{
            System.out.println(n+" Not a tech number");
        }
        }else{
            System.out.println(n+" Not a Tech number");
        }
        sc.close();
    }
}
