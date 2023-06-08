package practice03;

public class S01_PassByValue_IsimDuzenleme {
    /*
        String içinde verilmiş bir ismin orjinal değerini değiştirmeden aşağıdaki işlemleri yapan metotlar yazın.
            String isim = "Ali Veli Can";
            - Tüm harleri büyük yapın.
            - Tüm harfleri küçük yapın.
            - İsmin başına ünvan ekleyin.
            - Sadece ilk isim ve soyismi yazın ve orta ismi kısaltarak yazın (Örnek: Ali V. Can)
            - İsmin sadece ilk harflerini büyük, soyismin tamamını büyük harfle yazın.
    */

    public static void main(String[] args) {
        String isim = "Ali Veli Can";

        System.out.println(isim);
        tumuBuyuk(isim);
        System.out.println(isim);
        tumuKucuk(isim);
        unvanEkle("Dr.", isim);
    }

    public static void tumuBuyuk(String deger){
        deger = deger.toUpperCase();
        System.out.println(deger);
    }

    public static void tumuKucuk(String deger){
        deger = deger.toLowerCase();
        System.out.println(deger);
    }

    public static void unvanEkle(String unvan, String deger){
        deger = unvan + " " + deger;
        System.out.println(deger);
    }
}
















