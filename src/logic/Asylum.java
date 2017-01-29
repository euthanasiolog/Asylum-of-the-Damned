package logic;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 */
public class Asylum {
private ArrayList<Psycho> allPsyho = new ArrayList<Psycho>();// список вообще всех психов, оттуда будем сливать в БД.
                                                            // оченя секретно, поэтому доступ приват
    public static void main(String[]args) {
        Psycho p = new Psycho("Петров", "Денис", "Валерьевич",
                "Минск", LocalDate.of(1989, 9, 5), Sex.MALE,
                "дурны з Вялейки");
        System.out.println(p);

    }
    //метод добавки психа в список
    public void addPsyho (Psycho psycho){
        allPsyho.add(psycho);
    }

}
