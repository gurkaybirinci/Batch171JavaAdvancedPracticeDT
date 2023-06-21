package practice05.s01_inheritance;

import java.time.LocalDate;

public class BankaYonetimSistemi {
    public static void main(String[] args) {
        LocalDate dogumTarihi = LocalDate.of(1985, 03, 16);

        BireyselMusteriler bm1 = new BireyselMusteriler(
                "Ali Can",
                555687958,
                2000,
                "12345678901",
                dogumTarihi);

        System.out.println(bm1);
        System.out.println("_________________________");
        bm1.paraCekme(2001);

        KurumsalMusteri km1 = new KurumsalMusteri(
                "Ahmet Yılmaz",
                135879,
                10000,
                "135879546",
                "TechPro Education");

        System.out.println(km1);
        km1.paraYatirma(8000);

    }
}
