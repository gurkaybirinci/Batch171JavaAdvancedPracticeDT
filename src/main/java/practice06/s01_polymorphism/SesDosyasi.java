package practice06.s01_polymorphism;

public class SesDosyasi extends Medya{
    public SesDosyasi(String dosyaAdi) {
        super(dosyaAdi);
    }

    @Override
    public void oynat() {
        System.out.println("Ses dosyası oynatılıyor.");
    }

    @Override
    public void durdur() {
        System.out.println("Ses dosyası durduruluyor.");
    }
}
