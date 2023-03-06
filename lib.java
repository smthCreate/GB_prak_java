import java.util.Scanner;

public class lib {
    static void hello (String name){
        System.out.printf("Hi, %s!",name);
    }

    public static char getChar(Scanner scanner, String message){
        System.out.println(message);
        char sym1 = scanner.nextLine().charAt(0);
        return sym1;
    }

}
