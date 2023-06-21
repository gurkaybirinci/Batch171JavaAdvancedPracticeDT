package practice05.s01_inheritance;

public class KurumsalMusteri extends Musteri{
    String vergiNo;
    String sirketAdi;

    public KurumsalMusteri(String musteriAdi, int musteriNo, double hesapBakiyesi, String vergiNo, String sirketAdi) {
        super(musteriAdi, musteriNo, hesapBakiyesi);
        this.vergiNo = vergiNo;
        this.sirketAdi = sirketAdi;
    }

    @Override
    public String toString() {
        return "Kurumsal Müşteri: " +
                super.toString() +
                "\n\tVergi No: " + vergiNo +
                "\n\tŞirket Ad: " + sirketAdi;
    }
}
