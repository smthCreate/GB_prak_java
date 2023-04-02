package sem_6;

import sem_4.Lib;

import java.util.*;

public class Proga {
    public static void main(String[] args) {
        HashSet<Laptop> laptops = laptopSetGeneration(5);
        Map<Integer,Object> criterion = new HashMap<>();
        criterion.put(1,"price");
        criterion.put(2,"processor_count");
        criterion.put(3,"weight");
        criterion.put(4,"hard_drive_size");
        Set<Integer> keys = criterion.keySet();
        System.out.println("If you want to sort by criterion, input it's number");
        Integer us_inut;
        for (Integer num:keys) {
            System.out.printf("%d - %s",num,criterion.get((Object)num));
            System.out.println();
        }
        while (true){
            us_inut = lb.inputing_int();
            if (us_inut<=criterion.size()){
                break;
            }
            System.out.println("Try again!");
        }
        System.out.println("Input the minimal value for this parameter");
        double minny = lb.inputing_double();
        for (Laptop lp : laptops) {
            if (lp.Compare(us_inut, minny)) {
                System.out.println(lp);
                System.out.println();
            }
        }



    }
    public static HashSet laptopSetGeneration(int quantity){
        HashSet<Laptop> laptops = new HashSet<>();
        for (int i = 0; i <quantity; i++) {
            Laptop lp = laptopGeneration();
            System.out.println(lp);//sout laptops
            System.out.println();
            laptops.add(lp);
        }
        return laptops;
    }
    public static Laptop laptopGeneration(){
        Laptop lp = new Laptop();
        Random rd = new Random();
        lp.setPrice(Math.round(rd.nextDouble(1500)));
        lp.setWeight(Math.round(rd.nextDouble(3500)));
        lp.setHard_drive_size(Math.round(rd.nextDouble(2048)));
        lp.setProcessor_count(rd.nextDouble(16)/2*2);
        return lp;
    }
}
