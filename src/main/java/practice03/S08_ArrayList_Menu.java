package practice03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S08_ArrayList_Menu {

    /*
      Bir restoranın menüsüne eklenecek öğeleri kullanıcıdan alarak List'e ekleyin ve menüyü ekrana yazdırın.
    */

    public static void main(String[] args) {
        List<String> menu = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        String secenek;
        do {
            System.out.println("Lütfen menüye bir yemek ekleyin: ");
            String yemek = input.nextLine();

            if (menu.contains(yemek)){
                System.out.println(yemek + " listede zaten var. Tekrar eklenemez.");
            }else {
                menu.add(yemek);
                System.out.println(yemek + " menüye eklendi.");
            }

            System.out.println("Başka yemek eklemek ister misiniz (E/H)");
            secenek = input.nextLine();
        }while (secenek.equalsIgnoreCase("E"));

        System.out.println("_____________________");
        System.out.println("Restoran Menüsü:");
        for (String yemek : menu){
            System.out.println(" -" + yemek);
        }
    }
}
