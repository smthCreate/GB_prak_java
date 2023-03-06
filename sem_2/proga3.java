package sem_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Напишите метод, который составит строку, 
 * состоящую из 100 повторений слова TEST и метод, 
 * который запишет эту строку в простой текстовый файл, 
 * обработайте исключения.
 */
public class proga3 {
    public static void main(String[] args) {
        String text = "TEST ";
        text = generString(text);
        generFile(text);
    }

    public static String generString(String text){
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < 100; j++){
            sb.append(text);
        }
        return sb.toString();
    }
    
    public static void generFile(String stringToFile){
        try (FileWriter fw = new FileWriter("file.txt", false)) {
            fw.write(stringToFile);
            System.out.println("File was written");
            fw.flush();
            } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
