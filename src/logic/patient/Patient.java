package logic.patient;

import logic.enums.Sex;
import logic.interfaces.Sick;
import logic.treatment.Consultation;
import logic.treatment.Drug;
import logic.treatment.Procedure;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Абстрактный класс пациент, определяем основные свойства
 */
public abstract class Patient implements Sick {

    protected String name; //имя
    protected String surName; // фамилия
    protected String patronymic; // отчество
    protected Adress adress;
    protected LocalDate birthday;
    protected Sex gender; // пол
    protected LocalDate hospitalizationDate; // с какого числа лежит
    protected String diagnosis; // диагноз (пока просто строка)
    protected boolean isHospitalized; // true - госпитализирован, false - дома
    protected int ward; // палата (можно также добавить отделение)
    protected List<Hospitalisation> hospitalisationList; // список госпитализаций больного
    protected ArrayList<Drug> drugList;
    protected ArrayList<Procedure> procedureList;
    protected ArrayList<Consultation> consultationList;

    @Override
    public String toString() {
        return "Псих:\n" +
                surName + " " + name + " " + patronymic + " " + birthday.getYear() + " г. р.\n" +
                "Адрес: " + adress + '\n' +
                "Дата поступления: " + hospitalizationDate + "\n" +
                "Диагноз: " + diagnosis + '\n';
    }
}
