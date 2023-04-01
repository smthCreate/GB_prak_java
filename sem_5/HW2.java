package sem_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HW2 {

    public static void main(String[] args) {
        ArrayList<String> all_workers = lib.addingList();
        System.out.println(all_workers);
        HashMap<String,Integer> all_workers_names = new HashMap<>();
        for (int i = 0; i < all_workers.size(); i++) {
            String[] st = all_workers.get(i).split(" ");
            if (all_workers_names.containsKey(st[0])){
                all_workers_names.put(st[0], all_workers_names.get(st[0])+1);

            } else{
                all_workers_names.put(st[0],1);
            }
        }
        Integer maxy=0;
        Set<String> keys = all_workers_names.keySet();
        String[] arrayKeys = keys.toArray(new String[keys.size()]);
        for (int i = 0; i < keys.size(); i++) {
            if (all_workers_names.get(arrayKeys[i])>maxy){
                maxy = all_workers_names.get(arrayKeys[i]);
            }
        }
        String[] names = new String[keys.size()];
        HashMap<String,Integer> all_workers_names_clone = all_workers_names;
        while (maxy>0) {
            try {
                for (int i = 0; i < names.length; i++) {
                    
                }
            } catch (Exception e) {
                maxy--;
            }
        }
    }
}
