package sem_3;

import java.util.Arrays;


public class HW1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
        int[] result = mergeSorting(array);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] mergeSorting(int[] array) {
        if (array.length <= 1)
            return array;
        int[] left = Arrays.copyOfRange(array, 0, array.length / 2);
        int[] rigth = Arrays.copyOfRange(array, left.length, array.length);
        return merge(mergeSorting(left), mergeSorting(rigth));
    }

    public static int[] merge(int[] left, int[] right) {
        int resIn = 0, leftI = 0, rigthI = 0;
        int[] result = new int[left.length + right.length];

        while (leftI < left.length && rigthI < right.length) {
            if (left[leftI] < right[rigthI]) {
                result[resIn++] = left[leftI++];
            } else
                result[resIn++] = right[rigthI++];
        }

        while (resIn < result.length) {
            if (leftI < left.length) {
                result[resIn++] = left[leftI++];
            } else
                result[resIn++] = right[rigthI++];
        }
        return result;
    }

}
