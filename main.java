import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        /*
        int fd = 4;
        int ft = 5;
        var a = 19;
        System.out.println((a>>1 ));
        int[] arr[] = new int[3][5];
        for (int[] line : arr){
            for (int item:line){
                item = 4;
            }
        }
        for (int[] line : arr){
            for (int item:line){
                System.out.println((++item));
            }
        }
        int[] ar[] = new int[3][5];
        int[][] arr = new int[3][5];
        for (int i = 0; i<arr.length;i++){
            for (int j = 0; j<arr[i].length;j++){
                arr[i][j] = i*j;
            }
        }
        for (int[] line : arr){
            for (int item:line){
                System.out.println((item));
            }
        }
        System.out.println();
        System.out.println((arr.length));
        System.out.println(ar.length);
        */
        Scanner iScanner = new Scanner(System.in);
        System.out.println("name: ");
        String name = iScanner.nextLine();
        // lib.hello(name);
        // System.out.println("Print a and b: ");
        // boolean flag = iScanner.hasNextInt();
        // System.out.println(flag);
        // int a  = iScanner.nextInt();
        // flag = iScanner.hasNextInt();
        // System.out.println(flag);
        // int b = iScanner.nextInt();
        // int c = summer(a, b);
        // if (c<100){
        //     System.out.println(c);
        // } else {System.out.println("Too much!");}
        // System.out.println(getType(iScanner));
        // iScanner.close();
        // double num1;
        // double num2;
        // Scanner reader = new Scanner(System.in);
        // System.out.print("Enter two numbers: ");
        // num1 = reader.nextDouble();
        // num2 = reader.nextDouble();
        // System.out.print(num1);
        String res = hello(name);
        System.out.println(res);

    
    }
    static String getType(Object o){
        return o.getClass().getSimpleName();
    }
    // static int summer (int a, int b){
    //     int c;
    //     if (a>b) c = a+b;
    //     if (a<b) c = b+(a-b);
    //     return c;
    // }

    static String hello (String name){
        if (1>0){    
            System.out.printf("Hi, %s!",name);
            return "hi";
        } else {return "salut";}
    }

    // static int input(int a, int b,Scanner iScanner){
    //     System.out.println("Print a and b: ");
    //     boolean flag = iScanner.hasNextInt();
    //     System.out.println(flag);
    //     a  = iScanner.nextInt();
    //     b = iScanner.nextInt();
    //     iScanner.close();
    // }

}
/*
 * comments
 */
//dfvojpeiodjfvoidzjnmvkldzjnm loong com)
//++a prefix increment >
//a++ posfix increment <min priority