package logic.treatment;

import java.time.LocalDate;

/**
 * Created by plizz on 22.12.2016.
 */
public class Drug {
    LocalDate appointDrugDate = LocalDate.now();// дата назначения лекарства
    String drugName;
    String drugClass;
    double drugDose; // доза, вообще она в граммах, думаю, тут такое есть? а так х/з
    LocalDate cancellationDrugDate; //дата отмены лекарства
    //чел, надо еще время приема замутить - обычно мы часы приема указываем(9, 15, 21, например),
    // подумай, как это замутить


    private void setCancellationDrugDate(LocalDate cancellationDrugDate) {
        this.cancellationDrugDate = cancellationDrugDate;
    }

    public void cancellationOfDrug (){
        setCancellationDrugDate(LocalDate.now());
    }
}
