package fi.samk;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        EuklidinenEtaisyys etaisyys = new EuklidinenEtaisyys();
        System.out.print("1. Euklidinen etäisyys: ");
        System.out.println(etaisyys.countDistance(0,0,0,3));

        TasakylkinenKolmio t_kolmio = new TasakylkinenKolmio();
        System.out.println("2. Tasakylkinen kolmio:");
        t_kolmio.printTriangle(5);

        PintaAlat pinta_ala = new PintaAlat();
        System.out.print("3. Ympyrän pinta-ala: ");
        System.out.println(pinta_ala.ympyraPA(6));
        System.out.print("3. Neliön pinta-ala: ");
        System.out.println(pinta_ala.nelioPA(3.5));
        System.out.print("3. Kolmion pinta-ala: ");
        System.out.println(pinta_ala.skKolmioPA(3.5, 7));

        MatriisinSuurin matriisi = new MatriisinSuurin();
        int[][] matrix = {
                {1,5,7},
                {9,3,1},
                {0,1,1}
        };
        System.out.print("4. Matriisin suurimman arvon indeksi: ");
        System.out.println(Arrays.toString(matriisi.findBiggestIndex(matrix)));

        SuuruusJarjestys luvut = new SuuruusJarjestys();
        System.out.print("5. järjestetty array: ");
        System.out.println(Arrays.toString(luvut.orderArrayAsc(new int[]{8, 3, 2, 7})));

        Palindromiko palindromi = new Palindromiko();
        System.out.print("6. Onko palindromi: ");
        System.out.println(palindromi.isPalindrome("Aivot avaavat Ovia"));
        System.out.print("");
        System.out.print("");
        System.out.print("");
        System.out.print("");
    }
}