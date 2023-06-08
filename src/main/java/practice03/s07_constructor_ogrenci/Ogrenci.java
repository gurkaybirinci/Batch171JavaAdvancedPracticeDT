package practice03.s07_constructor_ogrenci;

public class Ogrenci {

    /*
        Ogrenci class'ı, öğrencinin adını, yaşını ve sınıfını temsil eden alanları içermelidir.
        Bu class'ın ir default constructor'ı, bir de parametreli constructor'ı olmalıdır.
        Bu class'ın değişken değerlerini ekrana yazdıran bir metot bulunmalıdır.
    */

    public String ad;
    public int yas;
    public int sinif;

    public Ogrenci(){
        ad = "Ali";
        yas = 12;
        sinif = 5;
    }

    public Ogrenci(String ad, int yas, int sinif) {
        this.ad = ad;
        this.yas = yas;
        this.sinif = sinif;
    }

    public void yasArtir(){
        yas++;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", yas=" + yas +
                ", sinif=" + sinif +
                '}';
    }
}
