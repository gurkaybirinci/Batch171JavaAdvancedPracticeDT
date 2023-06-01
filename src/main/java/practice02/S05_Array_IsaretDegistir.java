package practice02;

import java.util.Arrays;

public class S05_Array_IsaretDegistir {

    /*
        Array içerisindeki elementlerin işaretlerini (+-) değiştiren bir kod yazınız.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6
    */

    public static void main(String[] args) {
        int[] sayilar = {1, 2, -3, 4, -5, -6};

        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] *= -1;
        }

        System.out.println(Arrays.toString(sayilar));

    }
}









