package logic;

import logic.clinic.Asylum;
import logic.clinic.Department;
import logic.enums.Sex;
import logic.patient.Psycho;

import java.time.LocalDate;

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
        Department department1 = new Department("1", Sex.ALL);
        asylum.hospitalisation(p, department1);
        System.out.println("Прошло успешно!");
    }
}
