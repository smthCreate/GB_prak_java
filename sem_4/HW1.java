package sem_4;

import java.security.KeyStore.Entry;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class HW1 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int)(Math.random()*10));
        }
        System.out.println(list);
        List<Integer> reverseList = reverseList(list);
        System.out.println(reverseList);
    }
    public static List<Integer> reverseList(List<Integer> list){
        List<Integer> revlist = new LinkedList<>();
        for (int i = list.size()-1; i >=0; i--) {
            revlist.add(list.get(i));
        }

        return revlist;
    }
}
