package practice01;

import java.text.DecimalFormat;

public class S02_Ortalama {

        /*
        double sayi1 = 23.4;
        double sayi2 = 24.0;
        double sayi3 = 12;
        double sayi4 = 450.3;
        double sayi5 = 23000;

        Bu sayıların ortalamasını hesaplayan bir kod yazınız.
     */

    public static void main(String[] args) {
        double sayi1 = 23.4;
        double sayi2 = 24.0;
        double sayi3 = 12;
        double sayi4 = 450.3;
        double sayi5 = 23000;

        double toplam = sayi1 + sayi2 + sayi3 + sayi4 + sayi5;
        double ortalama = toplam / 5;

        DecimalFormat df = new DecimalFormat("0.00");
        String yeniFormat = df.format(ortalama);

        System.out.println("Sayıların ortalaması: " + yeniFormat);
    }

}
