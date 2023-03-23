package sem_4;

import java.util.*;
import java.util.Queue;


public class HW3 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Queue<Double> queue = new LinkedList<Double>();
        System.out.println("Input first number: ");
        double f1 = lib.inputing_double();
        System.out.println("Input operation:");
        String operation = lib.inputing_string();
        System.out.println("Input second number: ");
        double f2 = lib.inputing_double();
        calk(f1,operation,f2, queue);
    }
    static void calk(double f1, String strin, double f2, Queue queue ){
        double result = 0;
        switch (strin){
            case "+":
                result = f1 + f2;
                queue.offer(result);
                check(f1, strin, f2,queue,result);
                break;
            case "-":
                result = f1 - f2;
                queue.offer(result);
                check(f1, strin, f2,queue,result);
                break;
            case "*":
                result = f1 * f2;
                queue.offer(result);
                check(f1, strin, f2,queue,result);
                break;
            case "/":
                result = f1 / f2;
                queue.offer(result);
                check(f1, strin, f2,queue,result);
                break;
            case "=":
                if (queue.peek()==null){
                    System.out.println("Вы не ввели никаких операций до =, повторите попытку");
                    calk(f1, lib.inputing_string_basic(), f2,queue);
                } else{
                    result = (Double) queue.peek();
                    System.out.println(result);
                }
                break;                
            default:
                System.out.println("Операция не распознана, повторите ввод операции");
                calk(f1, lib.inputing_string_basic(), f2,queue);
                
            }
    }
    public static void check(double f1, String strin, double f2, Queue queue, double result){
        System.out.println("If you want to continue input Yes, if you want to stop input No, if you want to cancel previous operation input Cancel");
        String answer = lib.inputing_string_basic();
        switch (answer){
            case "Yes":
            System.out.println("Input operation:");
            String oper = lib.inputing_string_basic();
            System.out.println("Input next number:");
            double new_f2 = lib.inputing_double();
            calk(result, oper , new_f2,queue);
            break;
            case "No":
            System.out.println(result);
            break;
            case "Cancel":
            queue.poll();
            System.out.println(queue.peek());
            check(f1, strin, f2,queue,result);
            break;
            default:
            System.out.println("Операция не распознана, повторите ввод операции");
            check(f1, strin, f2, queue, result);
        }
    }
    public Object front;
    public Object rear;
    public void dequeue() {
    }
    public void enqueue(int i) {
    }
}
