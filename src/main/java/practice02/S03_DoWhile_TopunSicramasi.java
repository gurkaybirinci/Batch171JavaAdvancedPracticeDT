package practice02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class S03_DoWhile_TopunSicramasi {
    /*
        Bir top belirli yükseklikten atılmaktadır.(Scanner ile yüksekliği al)
        Atıldıktan sonra, atıldığı yüksekliğin 3/4 ü kadar yerden yukarı doğru zıplamaktadır.
        Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
        Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.
    */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        double yukseklik = input.nextDouble();

        double toplamYol = 0;
        int yereVurmaSayisi = 0;

        do {
            yereVurmaSayisi++;
            toplamYol += yukseklik;
            yukseklik *=  0.75;
            toplamYol += yukseklik;
        }while (yukseklik > 1);

        toplamYol += yukseklik;

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Toplam Yol: " + df.format(toplamYol));
        System.out.println("Yere Vurma Sayısı: " + yereVurmaSayisi);

    }
}




