package sem_4;

import java.util.LinkedList;
import java.util.Queue;


public class proga {
    public static void main(String[] args) {
        Queue<Integer> numbers = new LinkedList<>();
        // numbers.offer(1);
        // numbers.offer(2);
        // numbers.offer(3);
        if (numbers.poll()==null){
            System.out.println("Null");
        }
        
        System.out.println(numbers);
    }
}
