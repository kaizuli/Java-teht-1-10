package fi.samk;

import java.util.ArrayList;
import java.util.List;

public class Alkuluvut {
    public List<Integer> isPrime(int x) {
        List<Integer> number_list = new ArrayList<>();
        for (int i = 1; i <= x; i++) {
            number_list.add(i);
        }
        int half_index = number_list.size() - (number_list.size()/2);

        List<Integer> half_list = number_list.subList(half_index-1, number_list.size());

        List<Integer> prime_list = new ArrayList<>();
        for (int number : half_list) {
            boolean isPrime = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                prime_list.add(number);
            }
        }
        return prime_list;
    }
}