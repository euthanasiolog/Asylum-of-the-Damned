package logic;

/**
 * Интерфейс больной, определяем поведение
 */
public interface Sick {
    void hospitalize(); // госпитализировать
    void discharge(); // выписать
    void appointDrug(String drugName); //назначить лекарства
    void appointProcedure(String procedureName); // назначить процедуры
}
