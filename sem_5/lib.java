package sem_5;


import java.util.ArrayList;
import java.util.Scanner;

public class lib {
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
    static String inputing_string_nake(){
        Scanner scanner = new Scanner(System.in);
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
        double input = scanner.nextDouble();
        return input;
    }
    static ArrayList<String> inputing_string_for_HashMap_book(){
        ArrayList<String> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("If you want to input new number input yes, else input no");
        String answer = inputing_string_basic();
        String input;
        while(!answer.equals("no")) {
            System.out.println("Input new number");
            if (scanner.hasNext()){
                input = scanner.next();
            }
            else{
                System.out.println("Ошибка. Повторите ввод номера");
                scanner.next();
                input = inputing_string();
            }
            numbers.add(input);
            System.out.println("If you want to input new number input yes, else input no");
            answer = inputing_string_basic();
        }
        return numbers;
    }
    static ArrayList<String> addingList(){
        ArrayList<String> list = new ArrayList<>();
        System.out.println("If you want to stop input stop");
        String answer = inputing_string_basic();
        while (!answer.equals("stop")) {
            list.add(answer);
            answer = inputing_string_nake();
        }
        return list;
    }
}
