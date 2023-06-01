package practice02;

import java.util.Arrays;

public class S09_Array_OturmaPlani {

    /*
        Bir parti organizasyonunda, katılımcıların oturma planını bir array olarak tutuyorsunuz.
        Oturma planını yazdırdığınızda boş sandalyeler null olarak görünüyor.
        Bunun yerine "Rezerve Değil" yazmasını istiyorsunuz.
            String[] oturmaPlani = new String[10];
            System.out.println(Arrays.toString(oturmaPlani));
    */

    public static void main(String[] args) {
        String[] oturmaPlani = new String[10];
        System.out.println(Arrays.toString(oturmaPlani));

        String yeniDeger = "Rezerve Değil";
        Arrays.fill(oturmaPlani, yeniDeger);
        System.out.println(Arrays.toString(oturmaPlani));
    }
}
    /*
        Kelime Tahmin Oyunu
        Kullanıcının bir kelimeyi harf harf tahmin ederek doğru kelimeyi bulmasını sağlayan bir oyun geliştirin.
        Oyun şu adımları içermelidir:

        - Bir kelime listesi tanımlayın. Bu listede en az 5 farklı kelime bulunsun.
        - Oyuncu, listeden rastgele seçilen bir kelimeyi tahmin etmeye çalışmalıdır.
        - Oyuncuya, seçilen kelimenin uzunluğu kadar alt tire "_" işaretinden  oluşan bir dizi gösterilmelidir.
          Örneğin, seçilen kelime "elma" ise "____" şeklinde bir gösterim yapılmalıdır.
        - Oyuncu, her tahmininde bir harf girmelidir.
            - Girdiği harf, seçilen kelimede bulunuyorsa, doğru tahmin olduğu belirtilmeli ve
              ilgili harf yerine konulmalıdır.
            - Oyuncu, yanlış tahminlerde bulunduğunda, kalan hakkı azalmalıdır.
              Başlangıçta oyuncunun 5 hakka sahip olduğu varsayılmalıdır.
        - Oyuncunun doğru kelimeyi bulması durumunda, tebrik mesajı gösterilmeli ve oyun sonlandırılmalıdır.
        - Oyuncunun kalan hakları sıfır olduğunda, olumsuz bir mesaj ve doğru kelime gösterilmelidir.
     */