package practice01;

import java.util.Locale;
import java.util.Scanner;

public class S07_StringManipulations {

     /*
        Kullanıcıdan adını, ikinci adını ve soyadını tek bir satırda girmesini isteyin.
        Ardından ikinci adın ve soyadın ilk karakterini yazdırın.
        Örnek: Mark Hansel Twain ==> HT
    */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Adınızı, ikinci adınızı ve soyadınızı giriniz: ");
        String tamIsim = input.nextLine().toUpperCase();

        char ikinciAdinIlkHarfi = tamIsim.toUpperCase().charAt(tamIsim.indexOf(" ")+1);
        char soyadinIlkHarfi = tamIsim.charAt(tamIsim.lastIndexOf(" ")+1);

        System.out.println("" + ikinciAdinIlkHarfi + soyadinIlkHarfi);

    }

}