package logic;

import java.time.LocalDate;

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
            this.diagnosis = diagnosis;
            this.hospitalizationDate = date;
        }
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

    }

    @Override
    public void appointProcedure(String procedureName) {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
