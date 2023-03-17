package sem_3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class proga {
    public static void main(String[] args) {
        // ArrayList<Integer> myList = new ArrayList<>();
        // for (int i = 0; i < 10; i++) {
        //     myList.add((int)(Math.random()*100));
        // }
        
        // System.out.println(myList);
        // myList.sort(null);
        // System.out.println(myList);

        ArrayList<Integer> collection = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            collection.add(i);
        }
        System.out.println(collection);
        for(Iterator<Integer> iterator = collection.iterator();iterator.hasNext();){
            System.out.println(iterator.next()+" ");
        }
        System.out.println(collection);

    }
}
