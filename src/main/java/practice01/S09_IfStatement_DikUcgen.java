package practice01;

import java.util.Scanner;

public class S09_IfStatement_DikUcgen {

    /*
        Soru: Kullanıcıdan üç adet sayı alarak, bu sayıların bir dik üçgenin kenar uzunlukları olup olmadığını
        kontrol eden bir program yazmanız istenmektedir.
        Bir üçgenin dik üçgen olduğunu anlamak için Pisagor bağlantısından yararlanabilirsiniz.
        Pisagor bağlantısı, bir üçgenin dik üçgen olduğunu belirlemek için kullanılan bir formüldür
        ve a^2 + b^2 = c^2 şeklinde ifade edilir. Burada a, b ve c üçgenin kenar uzunluklarını temsil eder.

        İşte programınızın gereksinimleri:
        - Kullanıcıya üç adet sayı girmesi istenmelidir, bu sayılar üçgenin kenar uzunluklarını temsil eder.

        - Girilen her sayı negatif veya sıfır olamaz. Eğer kullanıcı negatif veya sıfır bir değer girerse,
          hata mesajı gösterilmeli ve tekrar geçerli bir değer girmesi istenmelidir.

        - Girilen kenar uzunluklarıyla bir dik üçgen oluşturulup oluşturulmadığı kontrol edilmelidir.
          Eğer oluşturulabiliyorsa, kullanıcıya "Girilen kenar uzunlukları bir dik üçgenin kenar uzunluklarına uyar."
          şeklinde bir mesaj gösterilmelidir. Dik üçgen değilse, kullanıcıya "Girilen kenar uzunlukları bir dik üçgenin
          kenar uzunluklarına uymaz." şeklinde bir mesaj gösterilmelidir.

        Programınızı bu gereksinimlere uygun olarak yazınız.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dik üçgenin kontrolü yapabilmem için üç adet sayı giriniz:");

        int a, b, c;

        System.out.println("Birinci kenar uzunluğunu giriniz:");
        a = input.nextInt();
        while (a <= 0) {
            System.out.println("Kenar uzunluğu pozitif olmalıdır. Lütfen geçerli bir değer giriniz:");
            a = input.nextInt();
        }

        System.out.println("İkinci kenar uzunluğunu giriniz:");
        b = input.nextInt();
        while (b <= 0) {
            System.out.println("Kenar uzunluğu pozitif olmalıdır. Lütfen geçerli bir değer giriniz:");
            b = input.nextInt();
        }

        System.out.println("Üçüncü kenar uzunluğunu giriniz:");
        c = input.nextInt();
        while (c <= 0) {
            System.out.println("Kenar uzunluğu pozitif olmalıdır. Lütfen geçerli bir değer giriniz:");
            c = input.nextInt();
        }

        if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
            System.out.println("Girilen kenar uzunlukları bir dik üçgenin kenar uzunluklarına uyar.");
        } else {
            System.out.println("Girilen kenar uzunlukları bir dik üçgenin kenar uzunluklarına uymaz.");
        }
    }
}


