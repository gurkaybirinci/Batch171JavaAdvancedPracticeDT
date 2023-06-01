package practice01;

import java.util.Scanner;

public class S08_StringManipulations_IfElse {

    /*
        Kullanıcının girdiği bir String ifadenin son üç karakterini alarak bu üç karakteri String ifadenin başına ve sonuna ekleyen
        bir Java programı yazınız.
    */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("En az üç karakterli bir kelime giriniz: ");
        String kelime = input.next();

        if (kelime.length() > 2){
            String ucHarf = kelime.substring(kelime.length()-3);
            System.out.println(ucHarf + kelime + ucHarf);
        } else{
            System.out.println("En az üç karakterli bir kelime girmelisiniz.");
        }

    }

}
