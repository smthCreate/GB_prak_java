package sem_3;

import java.util.ArrayList;

public class HW2 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myList.add((int)(Math.random()*10));
        }
        System.out.println(myList);
        ArrayList<Integer> resList = deletingOfOdd(myList);
        System.out.println(resList);
    }
    public static ArrayList<Integer> deletingOfOdd(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)%2==0) list.remove(i);
        }
        return list;
    }
}
