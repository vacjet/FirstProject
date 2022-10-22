package Study;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class TimeChange {
    static void smenaDejurnogo(LocalDate nachalo, LocalDate konets, Period p) {
        LocalDate data = nachalo;
        while (data.isBefore(konets)) {
            System.out.println("Наступила дата: " + data + ". Пора менять дежурного");
            data = data.plus(p);
        }
    }

    public static void main(String[] args) {
        LocalDate nachalo = LocalDate.of(2016, Month.MAY, 1);
        LocalDate konets = LocalDate.of(2020, 5, 31);
        Period p = Period.of(1, 3, 15);
        smenaDejurnogo(nachalo, konets, p);
    }
}
