package logic.treatment;

import java.time.LocalDate;

/**
 * Created by plizz on 22.12.2016.
 */
public class Procedure {
    String nameOfProcedure;
    int numberOfProcedure;
    LocalDate appointProcedureDate;
    LocalDate cancellationProcedureDate;
    public Procedure(){
        this.appointProcedureDate = LocalDate.now();
    }

    public String getNameOfProcedure() {
        return nameOfProcedure;
    }

    public void setNameOfProcedure(String nameOfProcedure) {
        this.nameOfProcedure = nameOfProcedure;
    }

    public int getNumberOfProcedure() {
        return numberOfProcedure;
    }

    public void setNumberOfProcedure(int numberOfProcedure) {
        this.numberOfProcedure = numberOfProcedure;
    }

    public LocalDate getAppointProcedureDate() {
        return appointProcedureDate;
    }

    public void setAppointProcedureDate(LocalDate appointProcedureDate) {
        this.appointProcedureDate = appointProcedureDate;
    }

    public LocalDate getCancellationProcedureDate() {
        return cancellationProcedureDate;
    }

    public void setCancellationProcedureDate(LocalDate cancellationProcedureDate) {
        this.cancellationProcedureDate = cancellationProcedureDate;
    }
}
