package logic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс псих
 */
public class Psycho extends Patient {

     public Psycho(String name, String surName, String patronymic,
     String address, LocalDate birthday, Sex gender, String diagnosis) {
     this.name = name;
     this.surName = surName;
     this.patronymic = patronymic;
     this.address = address;
     this.birthday = birthday;
     this.gender = gender;
     this.diagnosis = diagnosis;
     this.drugList = new ArrayList<Drug>();
     this.procedureList = new ArrayList<Procedure>();
     this.consultationList = new ArrayList<Consultation>();
     this.hospitalizationDate = LocalDate.now();
     }
     /**
     * Кладем человека в больницу (проверка: не лежит ли уже там)
     * @param date дата поступления
     * @param diagnosis диагноз
     */
    @Override
    public void hospitalize(LocalDate date, String diagnosis) {
        if (!isHospitalized) {
            isHospitalized = true;

        }
    }

    public Sex getPatientSex (){
        return gender;
    }


    /**
     * Выписываем из больницы (проверка: не выписан ли уже)
     * Заносим ходку в список госпитализаций больного
     * @param dischargeDate
     */
    @Override
    public void discharge(LocalDate dischargeDate) {
        if (isHospitalized) {
            isHospitalized = false;
            hospitalisationList
                    .add(new Hospitalisation(hospitalizationDate, dischargeDate, diagnosis));
            hospitalizationDate = null;
        }
    }

    @Override
    public void appointDrug(String drugName) {
        Drug drug = new Drug();
        drugList.add(drug);
    }

    @Override
    public void appointProcedure(String procedureName) {

    }

    @Override
    public void appointConsultation(String specialistName) {
        Consultation consultation = new Consultation();
        consultationList.add(consultation);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
