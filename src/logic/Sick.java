package logic;

import java.time.LocalDate;

/**
 * Интерфейс больной, определяем поведение
 */
public interface Sick {
    void hospitalize(LocalDate date, String diagnosis); // госпитализировать
    void discharge(LocalDate date); // выписать
    void appointDrug(String drugName); //назначить лекарства
    void appointProcedure(String procedureName); // назначить процедуры
    void appointConsultation(String specialistName);
}
