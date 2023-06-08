package practice03;

public class S02_PassByValue_SayiDuzenleme {
    /*
        İçinde verilmiş bir sayının orijinal değerini değiştirmeden aşağıdaki işlemleri yapan metotlar yazın.
            int sayi = 42;
            - Sayıyı karesini alın.
            - Sayıyı küpünü alın.
            - Sayının karekökünü alın.
            - Sayının mutlak değerini alın.
            - Sayıyı 10 ile çarpın ve sonucu yazdırın.
    */

    public static void main(String[] args) {
        int sayi = 42;

        System.out.println(sayi);
        System.out.println(karesiniAl(sayi));
        sayi = karesiniAl(sayi);
        System.out.println(sayi);

    }

    public static int karesiniAl(int deger){
        deger = (int) Math.pow(deger, 2);
        return deger;
    }
}






































