package practice06.s02_oop_project;

public class Runner {
    public static void main(String[] args) {
        HayvanatBahcesi hb = new HayvanatBahcesi();
        HayvanatBahcesi hba = new HayvanatBahcesi();

        Aslan simba = new Aslan("Simba", 8, "Aslan");
        Zurafa mimi = new Zurafa("Mimi", 27, "Zurafa");

        hb.hayvanTablola();

        hba.hayvanTablola();

    }
}
