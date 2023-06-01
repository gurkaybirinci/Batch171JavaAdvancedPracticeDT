package practice02;

import java.util.Arrays;

public class S04_Array_EuroDolarToplami {
    /*
        Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamlarını bulan bir kod yazınız.
        String str ="$1 $12 €34 €56 $45 €78";
        dolarToplami: 58
        euroToplami: 168
    */

    public static void main(String[] args) {
        String str ="$1 $12 €34 €56 $45 €78";

        String [] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));

        int euroToplam = 0;
        int dolarToplam = 0;

        for (String w : arr){
            if (w.startsWith("€")){
                int euroDeger = Integer.parseInt(w.substring(1));
                euroToplam += euroDeger;
            } else if (w.startsWith("$")){
                int dolarDeger = Integer.parseInt(w.substring(1));
                dolarToplam += dolarDeger;
            }
        }

        System.out.println("Euro Toplam: " + euroToplam);
        System.out.println("Dolar Toplam: " + dolarToplam);

    }

}




