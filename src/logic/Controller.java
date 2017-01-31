package logic;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Created by User on 31.01.2017.
 */
public class Controller {
    public static void main(String[]args) {
        Psycho p = new Psycho("Петров", "Денис", "Валерьевич",
                "Минск", LocalDate.of(1989, 9, 5), Sex.MALE,
                "дурны з Вялейки");
        System.out.println(p);
        Asylum asylum = new Asylum();
        Departmen departmen1 = new Departmen("1", Sex.ALL);
        asylum.hospitalisation(p, departmen1);
        System.out.println("Прошло успешно!");
    }
}
