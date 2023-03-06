package sem_2;

import java.util.Scanner;

public class proga1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Введите строку: ");
        String inputText = scanner.next();
        StringBuilder editTxt = GetCrypt(inputText);
        System.out.printf("Вывод: %s", editTxt);

        // Всё то, что необходимо закрыть в конце программы
        scanner.close();

    }
    public static StringBuilder GetCrypt(String inputText) {
        StringBuilder editTxt = new StringBuilder();
        int count = 0;
        for (int i = 0; i < inputText.length()-1; i++) {
            count += 1;
            if (inputText.charAt(i) != inputText.charAt(i+1))
            {
                editTxt.append(inputText.charAt(i));
                if (count != 1) editTxt.append(count);
                count = 0;
            }
            
        }
        // editTxt.append(inputText.charAt(inputText.length()-1));
        // editTxt.append(count);
        return editTxt;
    }
}