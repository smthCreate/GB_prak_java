package lek_3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class proga {
    public static void main(String[] args) {
        //System.out.println(sum(1.1, 2));


        // int[] a = new int[] {0,9};
        // for (int i : a) {System.out.printf("%d",i);}
        // a=addItem(a,2);
        // a=addItem(a,5);
        // System.out.println();
        // for (int j : a) {System.out.printf("%d",j);}


        // ArrayList<Integer> list = new ArrayList<Integer>();
        // // ArrayList list = new ArrayList();
        // list.add(1232);
        // int a = list.get(0);
        // System.out.printf("a is %s ",a);

        // for (Object o :list){
        //     System.out.println(o);
        // }


        List<Integer> list = List.of(1,12,123,1234,12345);
        for (int item: list){
            System.out.println(item);
        }
        Iterator<Integer> col = list.iterator();
        System.out.println();

        while (col.hasNext()){
            System.out.println(col.next());
            //col.next(); - Do NOT
            //col.remove(); - DO NOT
        }
    }


    public static Object sum (Object a, Object b){
        if (a instanceof Double && b instanceof Double){
            return (Object)((Double)a + (Double) b);
        } else if (a instanceof Integer && b instanceof Integer){
            return (Object)((Integer)a + (Integer) b);
        } else return 0;
    }
    public static int[] addItem(int[] array, int item){
        int length = array.length;
        int[] temp = new int[length+1];
        System.arraycopy(array, 0, temp, 0, length);
        temp[length] = item;
        return temp;
    }
}
