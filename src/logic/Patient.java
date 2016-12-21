package logic;

import java.time.LocalDate;

/**
 * Абстрактный класс пациент, определяем основные свойства
 */
public abstract class Patient implements Sick{

    // Поля, задающиеся при создании объекта
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
}
