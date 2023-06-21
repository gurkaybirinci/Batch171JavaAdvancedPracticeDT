package practice05.s02_abstraction;

public class UniversiteYonetimSistemi {
    public static void main(String[] args) {
        BilgisayarBilimleri bm = new BilgisayarBilimleri();
        bm.dersAdi = "Temel Bilgisayar - 1";
        System.out.println(bm);

        System.out.println(bm.kategoriAdi());

        Isletme i̇sletme = new Isletme();
        System.out.println(i̇sletme.kategoriAdi());

    }
}
