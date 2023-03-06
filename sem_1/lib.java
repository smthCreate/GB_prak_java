package sem_1;

import java.util.Scanner;

public class lib {
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
}
