package logic;

import java.time.LocalDate;
import java.util.List;

/**
 * в этом классе описываем пациента, как нетрудно догадаться
 */
public class Patient {

    // Поля, задающиеся при создании объекта
    private String name; //имя
    private String surName; // фамилия
    private String patronymic; // отчество
    private String address;
    private LocalDate birthday;
    private Sex gender; // пол
    private LocalDate hospitalizationDate; // с какого числа лежит
    private String diagnosis; // диагноз (пока просто строка)
    private boolean isHospitalized; // true - госпитализирован, false - дома

    // Задаются в процессе работы
    private int ward; // палата (можно также добавить отделение)
    private List<Recipe> drugs; // список принимаемых лекарств

    public Patient(String name, String surName, String patronymic,
                   String address, LocalDate birthday, Sex gender,
                   LocalDate hospitalizationDate, String diagnosis) {
        this.name = name;
        this.surName = surName;
        this.patronymic = patronymic;
        this.address = address;
        this.birthday = birthday;
        this.gender = gender;
        this.hospitalizationDate = hospitalizationDate;
        this.diagnosis = diagnosis;
        isHospitalized = true;
    }
}
