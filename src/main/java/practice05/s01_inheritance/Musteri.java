package practice05.s01_inheritance;

public class Musteri {
    String musteriAdi;
    int musteriNo;
    double hesapBakiyesi;

    public Musteri(String musteriAdi, int musteriNo, double hesapBakiyesi) {
        this.musteriAdi = musteriAdi;
        this.musteriNo = musteriNo;
        this.hesapBakiyesi = hesapBakiyesi;
    }

    public void paraCekme(double para){
        if (para <= hesapBakiyesi){
            hesapBakiyesi -= para;
            System.out.println("Hesabınızdan " + para + " TL çekilmiştir.");
            System.out.println("Yeni bakiyeniz: " + hesapBakiyesi + " TL'dir.");
        }else {
            System.out.println("Hesabınızda yeterli bakiyeniz bulunmamaktadır.");
        }
    }

    public void paraYatirma(double para){
        hesapBakiyesi += para;
        System.out.println("Hesabınıza " + para + " TL eklenmiştir.");
        System.out.println("Yeni bakiyeniz: " + hesapBakiyesi + " TL'dir.");
    }

    @Override
    public String toString() {
        return  "\n\tMüşteri Adı: " + musteriAdi +
                "\n\tMüşteri No: " + musteriNo +
                "\n\tHesap Bakiyesi: " + hesapBakiyesi;
    }
}
