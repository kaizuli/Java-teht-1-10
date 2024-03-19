package fi.samk;

import java.sql.Array;
import java.util.Arrays;

public class SuuruusJarjestys {
    public int[] orderArrayAsc(int[] array) {
        int[] sorted_array = Arrays.copyOf(array, array.length);
        Arrays.sort(sorted_array);
        return sorted_array;
    }
}
