package sem_3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class HW3 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myList.add((int)(Math.random()*10));
        }
        System.out.println(myList);
        
        System.out.printf("MAX: %d, ",Collections.max(myList));
        System.out.printf("MIN: %d, ",Collections.min(myList));
        System.out.printf("Average: %f, ",average(myList));
    }
    public static double average(ArrayList<Integer> list){
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum+=list.get(i);
        }
        return sum/list.size();
    }
}
