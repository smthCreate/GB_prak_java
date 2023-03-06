package sem_2;

import java.util.Scanner;

public class proga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input length");
        int length = scanner.nextInt();
        scanner.nextLine();
        char sym1 = getChar(scanner, "Input firt symbol");
        char sym2 = getChar(scanner, "Input second symbol");
        System.out.println(generString(length, sym1, sym2)); 
    }

    public static char getChar(Scanner scanner, String message){
        System.out.println(message);
        char sym1 = scanner.nextLine().charAt(0);
        return sym1;
    }

    public static String generString(int length, char symbol1,char symbol2){
        StringBuilder builder = new StringBuilder();
        for (int i =0; i<length/2;i++){
            builder.append(new char[]{symbol1,symbol2});
        }
        return builder.toString();
    }
}
