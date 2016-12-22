package logic;

import java.time.LocalDate;
import java.util.List;

/**
 * Абстрактный класс пациент, определяем основные свойства
 */
public abstract class Patient implements Sick{

    protected String name; //имя
    protected String surName; // фамилия
    protected String patronymic; // отчество
    protected String address;
    protected LocalDate birthday;
    protected Sex gender; // пол
    protected LocalDate hospitalizationDate; // с какого числа лежит
    protected String diagnosis; // диагноз (пока просто строка)
    protected boolean isHospitalized; // true - госпитализирован, false - дома
    protected int ward; // палата (можно также добавить отделение)
    protected List<Hospitalisation> hospitalisationList; // список госпитализаций больного

    @Override
    public String toString() {
        return "Псих:\n" +
                surName + " " + name + " " + patronymic + " " + birthday.getYear() + " г. р.\n" +
                "Адрес: " + address + '\n' +
                "Дата поступления: " + hospitalizationDate + "\n" +
                "Диагноз: " + diagnosis + '\n';
    }
}
