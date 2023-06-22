package practice06.s01_polymorphism;

public class MedyaOynatici {
    public static void main(String[] args) {
        Medya medya = new Medya("dosya.txt");
        SesDosyasi sd = new SesDosyasi("Ses Dosyası.mp3");
        sd.oynat();

    }

}
