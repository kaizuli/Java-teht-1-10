package fi.samk;

public class TasakylkinenKolmio {
    public void printTriangle(int h) {
        for (int i = 1; i <= h; i++) {
            for (int j = h; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i*2)-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
