package logic.interfaces;

import logic.patient.Hospitalisation;

/**
 * Интерфейс больной, определяем поведение
 */
public interface Sick {
    void createHospitalization(); // госпитализировать
    void discharge(Hospitalisation hospitalisation); // выписать
    void appointDrug(String drugName); //назначить лекарства
    void appointProcedure(String procedureName); // назначить процедуры
    void appointConsultation(String specialistName);
}
