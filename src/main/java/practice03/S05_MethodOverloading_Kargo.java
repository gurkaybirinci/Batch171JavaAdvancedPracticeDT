package practice03;

public class S05_MethodOverloading_Kargo {

    /*
        İki farklı method oluşturun.
          - İlk method, bir paketin ağırlığını parametre olarak alacak ve kargo ücretini hesaplayıp döndürecek.
          - İkinci method ise bir paketin ağırlığı ve boyutları parametrelerini alacak ve
            bu bilgilere göre kargo ücretini hesaplayıp döndürecek.
        Bu methodları kullanarak farklı paketlerin kargo ücretlerini hesaplayın.
    */

    public static void main(String[] args) {
        double kargoUcreti1 = kargoHesapla(5.2);
        System.out.println("Kargo Ücreti: " + kargoUcreti1);

        double kargoUcreti2 = kargoHesapla(35, 5);
        System.out.println("Kargo Ücreti: " + kargoUcreti2);

    }

    public static double kargoHesapla(double agirlik){
        return agirlik * 2.5;
    }

    public static double kargoHesapla(double agirlik, double boyutlar){
        return agirlik * 2.5 + boyutlar * 1.5;
    }

}
