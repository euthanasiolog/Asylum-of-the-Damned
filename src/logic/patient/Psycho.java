package logic.patient;

import logic.enums.Sex;
import logic.treatment.Consultation;
import logic.treatment.Drug;
import logic.treatment.Procedure;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Класс псих
 */
public class Psycho extends Patient {

     public Psycho(String name, String surName, String patronymic,
                   LocalDate birthday, Sex gender, String diagnosis) {
     this.name = name;
     this.surName = surName;
     this.patronymic = patronymic;
     this.adress = new Adress();
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
     */

    public void createHospitalization() {
        if (!isHospitalized) {
            isHospitalized = true;
            Hospitalisation hospitalisation = new Hospitalisation();
            hospitalisation.setDiagnosis(diagnosis);
        }
    }

    public Sex getPatientSex (){
        return gender;
    }


    /**
     * Выписываем из больницы (проверка: не выписан ли уже)
     * Заносим ходку в список госпитализаций больного
     */
    @Override
    public void discharge(Hospitalisation hospitalisation) {
        hospitalisation.setTo(LocalDate.now());
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
