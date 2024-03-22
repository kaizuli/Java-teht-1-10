package fi.samk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class LukuHashmap {

    private int generate_random_number() {
        Random random = new Random();
        int randomNumber = random.nextInt(101)-50;
        return randomNumber;
    }
    public HashMap<String, ArrayList<Integer>> create_hashmap() {
        HashMap<String, ArrayList<Integer>> values_hashmap = new HashMap<String, ArrayList<Integer>>();
        ArrayList<Integer> positives = new ArrayList<>();
        ArrayList<Integer> negatives = new ArrayList<>();
        ArrayList<Integer> zeros = new ArrayList<>();
        for (int i = 0; i <100; i++) {
            int value = generate_random_number();
            if (value > 0) {
                positives.add(value);
            } else if (value < 0) {
                negatives.add(value);
            } else if (value == 0) {
                zeros.add(value);
            }
        }
        values_hashmap.put("positive", positives);
        values_hashmap.put("negative", negatives);
        values_hashmap.put("zero", zeros);
        return values_hashmap;
    }
}
