package practice05.s02_abstraction;

public class BilgisayarBilimleri extends Kurs{

    @Override
    public String kategoriAdi() {
        return "Bilgisayar";
    }

    @Override
    public String toString() {
        return "BilgisayarBilimleri{" +
                "dersAdi='" + dersAdi + '\'' +
                ", ogretmenAdi='" + ogretmenAdi + '\'' +
                ", dersSaati=" + dersSaati +
                ", kursUcreti=" + kursUcreti +
                '}';
    }
}
