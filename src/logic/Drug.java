package logic;

import java.time.LocalDate;

/**
 * Created by plizz on 22.12.2016.
 */
public class Drug {
    LocalDate appointDate = LocalDate.now();// дата назначения лекарства
    String drugName;
    String drugClass;
    double drugDose; // доза, вообще она в граммах, думаю, тут такое есть? а так х/з
    LocalDate offDrugDate; //дата отмены лекарства
    //чел, надо еще время приема замутить - обычно мы часы приема указываем(9, 15, 21, например),
    // подумай, как это замутить

    public LocalDate setOffDrugDate(LocalDate offDrugDate) {
        this.offDrugDate = offDrugDate;
        return offDrugDate;
    }

    public void offDrug (){
        offDrugDate = setOffDrugDate(LocalDate.now());
    }
}
