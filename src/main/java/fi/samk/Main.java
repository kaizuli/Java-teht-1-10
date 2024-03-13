package fi.samk;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        EuklidinenEtaisyys etaisyys = new EuklidinenEtaisyys();
        System.out.println(etaisyys.countDistance(0,0,0,3));

        TasakylkinenKolmio t_kolmio = new TasakylkinenKolmio();
        t_kolmio.printTriangle(5);

        PintaAlat pinta_ala = new PintaAlat();
        System.out.println(pinta_ala.ympyraPA(6));
        System.out.println(pinta_ala.nelioPA(3.5));
        System.out.println(pinta_ala.skKolmioPA(3.5, 7));
    }
}