package fi.samk;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public int countFibonacci(int n) {
        List<Integer> fibos = new ArrayList<>(List.of(1, 1));

        for (int i = 2; i <= n; i++) {
            int x = (fibos.get(i-2) + fibos.get(i-1));
            fibos.add(x);
        }
        return fibos.get(n-1);
    }
}
