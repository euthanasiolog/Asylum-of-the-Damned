package logic;

import java.time.LocalDate;

/**
 * в этом классе описываем пациента, как нетрудно догадаться
 */
public class Patient {
    private String name; //имя
    private String surName; // фамилия
    private String patronymic; // отчество
    private String address;
    private LocalDate birthday;
    private int age; // высчитывается из даты рождения
    private Sex gender; // пол
    private LocalDate hospitalizationDate; // с какого числа лежит
    private String diagnosis; // диагноз (пока просто строка)
    private boolean isHospitalized; // true - госпитализирован, false - дома
    private int ward; // палата

}
