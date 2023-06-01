package practice02;

public class S06_Array_NotOrtalamasi {

    /*
        Bir öğrenci sınıfının notlarını içeren bir array verildiğinde,
        bu notların ortalamasını hesaplayan bir program yazın.
        {84, 91, 76, 85, 98}
    */

    public static void main(String[] args) {
        int[] arr = {84, 91, 76, 85, 98};
        int toplam = 0;

        for (int w : arr){
            toplam += w;
        }

        double ortalama = (double) toplam / arr.length;
        System.out.println(ortalama);

    }

}
