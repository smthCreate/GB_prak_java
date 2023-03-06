package sem_1;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print n: ");
        boolean flag = scanner.hasNextInt();
        System.out.println(flag);
        int n  = scanner.nextInt();
        System.out.println(troyangleNumber(n));
        System.out.println(factorial(n));
    }

    static double troyangleNumber (int n){
        double res = 0.5*n*(n+1);
        return res;
    }
    static int factorial (int n){
        if (n>0){
            return n+factorial(n-1);
        } else {
            return 0;
        }
    }
}
