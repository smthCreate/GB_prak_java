package sem_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HW1 {
    public static void main(String[] args) {
        Map<String,ArrayList> db = new HashMap<>();
        new_user(db);

        // db.put(1,numbe);
        // db.put(2,"Ananas");
        // db.put(3,"Pear");
        System.out.println(db); 
        // db.putIfAbsent(null, null);
        // db.get(2);
        // db.remove(3);
        // System.out.println(db.containsKey(5));
        // System.out.println(db.containsValue("Apricot"));
        // System.out.println(db.keySet());
    }
    public static void book(Map<String,ArrayList> db){
        System.out.println("Введите ниже имя пользователя, а дальше все его номера");
        db.put(lib.inputing_string_basic(), lib.inputing_string_for_HashMap_book());
        
    }
    public static void new_user(Map<String,ArrayList> db){
        System.out.println("Do you want to add new_user? (input yes or no)");
        String answer = lib.inputing_string_basic();
        while (!answer.equals("no")) {
            book(db);
            System.out.println("Do you want to add new_user? (input yes or no)");
            answer = lib.inputing_string_basic();            
        }
        System.out.println("Adding users is ended");
    }

}
