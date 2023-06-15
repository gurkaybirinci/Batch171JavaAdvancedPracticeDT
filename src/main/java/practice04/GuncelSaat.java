package practice04;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class GuncelSaat {
    public static void main(String[] args) throws InterruptedException {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        while (true){
            LocalTime simdikiZaman = LocalTime.now();
            System.out.format("\r" + dtf.format(simdikiZaman));
            Thread.sleep(1000);
        }
    }
}
