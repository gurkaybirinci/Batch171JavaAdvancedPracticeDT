package practice06.s02_oop_project;

public abstract class Hayvan {
    private String ad;
    private int yas;
    private String tur;

    public Hayvan(String ad, int yas, String tur) {
        this.ad = ad;
        this.yas = yas;
        this.tur = tur;
        HayvanatBahcesi.hayvanEkle(this);
    }

    public abstract void yemekYer();
    public abstract void sesCikarir();

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    @Override
    public String toString() {
        return "\tHayvan Bilgileri:" +
                "\nAd = " + ad +
                "\nYaş = " + yas +
                "\nTür = " + tur;
    }
}
