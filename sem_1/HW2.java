package sem_1;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class HW2 {
    public static void main(String[] args) {
        boolean[] primes = getAllPrimesLessThan(1001);
        for (int i = 0; i < primes.length; i++) {
            if (primes[i]==true)
                System.out.println(i);
        }
    }

    
    public static boolean[] getAllPrimesLessThan(int sieveSize) {
        var sieve = new BitSet(sieveSize);
        sieve.set(0, sieveSize - 1, true);
        sieve.set(0, false);
        sieve.set(1, false);
        for (int i = 2; i * i < sieve.length(); i++) {
            if (sieve.get(i)) {
                for (int j = i * i; j < sieve.length(); j += i) {
                    sieve.set(j, false);
                }
            }
        }
    
        boolean[] primes = new boolean[sieveSize];
        primes[0] = false;
        primes[1] = false;
        for (int i = 2; i < sieve.length(); i++) {
            if (sieve.get(i)) {
                primes[i] = sieve.get(i);
            } else{
                primes[i] = false;
            }
        }
        return primes;
    }
}
