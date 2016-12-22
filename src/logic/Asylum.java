package logic;

import java.time.LocalDate;

/**
 *
 */
public class Asylum {

    public static void main(String... args) {
        Psycho p = new Psycho("Петров", "Денис", "Валерьевич",
                "Минск", LocalDate.of(1989, 9, 5), Sex.MALE,
                "дурны з Вялейки");
        System.out.println(p);

    }
}
