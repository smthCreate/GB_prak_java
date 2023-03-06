package lek_1;

import java.io.File;

public class proga {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < 1_000_000; j++){
            sb.append("+");
        }

        File f1 = new File("f1.txt");
        System.out.println(f1.getAbsolutePath());

        

    }
}
