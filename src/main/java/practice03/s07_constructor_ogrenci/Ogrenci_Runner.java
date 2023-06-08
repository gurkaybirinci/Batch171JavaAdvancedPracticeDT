package practice03.s07_constructor_ogrenci;

public class Ogrenci_Runner {
    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci();
//        ogrenci1.ad = "Ali";
//        ogrenci1.yas = 12;
//        ogrenci1.sinif = 5;
        System.out.println(ogrenci1.toString());

        Ogrenci ogrenci2 = new Ogrenci("Ahmet", 15, 8);
        System.out.println(ogrenci2.toString());

        // Alıştırma: Bir öğrencinin adını ve sınıfını güncelleyin ve değerlerini ekrana yazdırın
        ogrenci2.ad = "Mehmet";
        ogrenci2.sinif = 9;
        System.out.println(ogrenci2);

        /*
        Alıştırma: Ogrenci class'ına bir metot ekleyerek öğrencinin yaşını bir yıl arttıran bir işlem yapın.
        Bu metodu kullanarak bir öğrencinin yaşını bir yıl arttırın ve sonucu ekrana yazdırın.
        */
        ogrenci2.yasArtir();
        System.out.println(ogrenci2);

        ogrenci1.yasArtir();
        System.out.println(ogrenci1);



    }
}
