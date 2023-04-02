package sem_6;


import java.util.Scanner;

public class lb {
    // public static void main(String[] args) {
    //     System.out.println(inputing_string_basic());
    // }


    static String inputing_string(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input here: ");
        String input;
        if (scanner.hasNext()){
            input = scanner.next();
        }else{
            System.out.println("Ошибка. Повторите ввод операции");
            scanner.next();
            input = inputing_string();
        }
        return input;
    }

    static int inputing_int(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input here: ");
        int input = scanner.nextInt();
        return input;
    }
    static String inputing_string_basic(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input here: ");
        String input;
        input = scanner.next();
        return input;
    }
    static double inputing_double(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input here: ");
        double input;
        if (scanner.hasNextDouble()){
            input = (double) scanner.nextDouble();
        }else{
            System.out.println("Ошибка. Повторите ввод операции");
            scanner.next();
            input = inputing_double();
        }

        return input;
    }
}
